package com.example.demo.models.data.entity

data class Account (
    var state: State?,
    var attributes: Attributes?,
    var roles: List<String>?,
    var preferences: Map<String, Any>?,
    var accounts: List<FamilyAccount>?
) {
    data class State(
        var signatureUploadStatus: String?,
        var sourceAccountStatus: String?,
        var depositAccountStatus: String?,
        var onboardPaymentStatus: String?,
        var pinStatus: String?,
        var nachStatus: String?,
        var onboardedResourceFlag: Int = 0,
        var subscriptionList: List<Subscription>?,
        var nachSkippedResourceFlag: Int = 0,
        var signatureNachResourceFlag: Int = 0,
        var signatureCamsResourceFlag: Int = 0,
        var tracking: List<Tracking>?
    ) {

        data class Subscription(
            var type: String?,
            var status: String?
        )

        data class Tracking(
            var event: String?,
            var expiryDate: String?
        )
    }

    data class Attributes(
        var uuid: String?,
        var mobile: String?,
        var email: String?,
        var type: String?,
        var accountName: String?,
        var sipAmount: Double?,
        var dialCode: String?,
        var countryCode: String?,
        var isNRI: Boolean?,
        var signatureId: String?,
        var panDetails: PANDetails?,
        var personalDetails: PersonalDetails?,
        var bankDetails: BankDetails?,
        var nomineeDetails: NomineeDetails?,
        var nriDetails: NRIDetails?
    ) {

        data class PANDetails(
            var identifier: String?,
            var userName: String?,
            var status: String?,
            var verificationDate: String?
        )

        data class PersonalDetails(
            var firstName: String?,
            var lastName: String?,
            var dob: Long?,
            var address: String?,
            var pincode: String?,
            var gender: Int?,
            var city: String?,
            var state: String?,
            var maritialStatus: String?,
            var occupation: String?,
            var citizenship: String?,
            var residentialStatus: String?
        )

        data class BankDetails(
            var vpa: String?,
            var bankName: String?,
            var ifsc: String?,
            var accountHolderName: String?,
            var accountNumber: String?,
            var customerId: String?
        )

        data class NomineeDetails(
            var nomineeName: String?,
            var nomineeRelation: String?
        )

        data class NRIDetails(
            var taxStatus: String?,
            var address: String?,
            var city: String?,
            var pincode: String?,
            var state: String?,
            var country: String?,
            var taxfilling: Int = 0,
            var countryOfTaxResidency: String?,
            var taxIdentificationType: String?,
            var tin: String?
        )
    }

    data class FamilyAccount(
        var id: String?,
        var name: String?
    )
}
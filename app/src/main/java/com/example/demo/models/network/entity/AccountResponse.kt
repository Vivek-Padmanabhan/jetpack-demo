package com.example.demo.models.network.entity

import com.google.gson.annotations.SerializedName

data class AccountResponse (
    @SerializedName("code") var code: String?,
    @SerializedName("data") var data: Data?,
    @SerializedName("message") var message: String?
) {

    data class Data(
        @SerializedName("state") var state: State?,
        @SerializedName("attributes") var attributes: Attributes?,
        @SerializedName("roles") var roles: List<String>?,
        @SerializedName("preferences") var preferences: Map<String, Any>?,
        @SerializedName("accounts") var accounts: List<FamilyAccount>?
    ) {

        data class State(
            @SerializedName("SIGNATURE_UPLOAD") var signatureUploadStatus: String?,
            @SerializedName("SOURCE_ACCOUNT_CREATION") var sourceAccountStatus: String?,
            @SerializedName("DEPOSIT_ACCOUNT_CREATION") var depositAccountStatus: String?,
            @SerializedName("ONBOARD_PAYMENT") var onboardPaymentStatus: String?,
            @SerializedName("PIN_DETAILS") var pinStatus: String?,
            @SerializedName("NACH") var nachStatus: String?,
            @SerializedName("onboarded") var onboardedResourceFlag: Int = 0,
            @SerializedName("SUBSCRIPTION") var subscriptionList: List<Subscription>?,
            @SerializedName("nach_skipped") var nachSkippedResourceFlag: Int = 0,
            @SerializedName("signature_nach") var signatureNachResourceFlag: Int = 0,
            @SerializedName("signature_cams") var signatureCamsResourceFlag: Int = 0,
            @SerializedName("TRACKING") var tracking: List<Tracking>?
        ) {

            data class Subscription(
                @SerializedName("type") var type: String?,
                @SerializedName("status") var status: String?
            )

            data class Tracking(
                @SerializedName("event") var event: String?,
                @SerializedName("expiry_date") var expiryDate: String?
            )
        }

        data class Attributes(
            @SerializedName("uuid") var uuid: String?,
            @SerializedName("mobile") var mobile: String?,
            @SerializedName("email") var email: String?,
            @SerializedName("type") var type: String?,
            @SerializedName("accountName") var accountName: String?,
            @SerializedName("sip_amount") var sipAmount: Double?,
            @SerializedName("dialCode") var dialCode: String?,
            @SerializedName("countryCode") var countryCode: String?,
            @SerializedName("isNRI") var isNRI: Boolean?,
            @SerializedName("signature_id") var signatureId: String?,
            @SerializedName("userDetails") var userDetails: UserDetails?,
            @SerializedName("kycDetails") var kycDetails: KycDetails?,
            @SerializedName("accounts") var accounts: List<Account>?,
            @SerializedName("userNomineeDetails") var nomineeDetails: NomineeDetails?,
            @SerializedName("userNRIDetail") var nriDetail: NRIDetail?
        ) {

            data class UserDetails(
                @SerializedName("firstName") var firstName: String?,
                @SerializedName("lastName") var lastName: String?,
                @SerializedName("dob") var dob: Long?,
                @SerializedName("address") var address: String?,
                @SerializedName("pincode") var pincode: String?,
                @SerializedName("gender") var gender: Int?,
                @SerializedName("city") var city: String?,
                @SerializedName("state") var state: String?,
                @SerializedName("maritial_status") var maritialStatus: String?,
                @SerializedName("occupation") var occupation: String?,
                @SerializedName("citizenship") var citizenship: String?,
                @SerializedName("residential_status") var residentialStatus: String?
            )

            data class KycDetails(
                @SerializedName("PAN") var pan: PanDetails?
            ) {

                data class PanDetails(
                    @SerializedName("identifier") var identifier: String?,
                    @SerializedName("userName") var userName: String?,
                    @SerializedName("status") var status: String?,
                    @SerializedName("verificationDate") var verificationDate: String?
                )
            }

            data class Account(
                @SerializedName("type") var type: String?,
                @SerializedName("vpa") var vpa: String?,
                @SerializedName("additionalInfo") var additionalInfo: AdditionalInfo?
            ) {

                data class AdditionalInfo(
                    @SerializedName("bankName") var bankName: String?,
                    @SerializedName("ifsc") var ifsc: String?,
                    @SerializedName("accountHolderName") var accountHolderName: String?,
                    @SerializedName("accountNumber") var accountNumber: String?,
                    @SerializedName("customerId") var customerId: String?
                )
            }

            data class NomineeDetails(
                @SerializedName("nomineeName") var nomineeName: String?,
                @SerializedName("nomineeRelation") var nomineeRelation: String?
            )

            data class NRIDetail(
                @SerializedName("taxStatus") var taxStatus: String?,
                @SerializedName("address") var address: String?,
                @SerializedName("city") var city: String?,
                @SerializedName("pincode") var pincode: String?,
                @SerializedName("state") var state: String?,
                @SerializedName("country") var country: String?,
                @SerializedName("taxfilling") var taxfilling: Int = 0,
                @SerializedName("countryOfTaxResidency") var countryOfTaxResidency: String?,
                @SerializedName("taxIdentificationType") var taxIdentificationType: String?,
                @SerializedName("tin") var tin: String?
            )
        }

        data class FamilyAccount(
            @SerializedName("id") var id: String?,
            @SerializedName("name") var name: String?
        )
    }
}
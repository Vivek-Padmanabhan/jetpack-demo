package com.example.demo.models.data.repository

import javax.inject.Inject

import com.example.demo.models.data.entity.Account
import com.example.demo.models.network.entity.AccountResponse
import com.example.demo.models.network.service.AccountService

class AccountRepository @Inject constructor(private val accountService: AccountService) {

    suspend fun getAccount(user_id: String): Account {
        val accountResponse = accountService.getAccount(user_id)
        return transformResponse(accountResponse)
    }

    private fun transformResponse(accountResponse: AccountResponse): Account {
        // TODO
        return Account(null, null, null, null, null)
    }
}
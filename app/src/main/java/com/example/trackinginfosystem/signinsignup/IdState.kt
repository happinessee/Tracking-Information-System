package com.example.trackinginfosystem.signinsignup

class IdState(val id: String? = null) :
    TextFieldState(validator = ::isIdValid, errorFor = ::idValidationError) {
    init {
        id?.let {
            text = it
        }

    }

}

private fun idValidationError(id: String): String {
    return "Invalid id: $id"
}

private fun isIdValid(id: String): Boolean {
    return true
}

val idStateSaver = textFieldStateSaver(idState())


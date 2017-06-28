package jp.cloudpack.naiki.twilio.sample

import java.net.URI

import com.twilio.Twilio
import com.twilio.rest.api.v2010.account.Call
import com.twilio.type.PhoneNumber

fun main(args: Array<String>) {

    val ACCOUNT_SID = "your accunt"
    val AUTH_TOKEN = "your token"

    Twilio.init(ACCOUNT_SID, AUTH_TOKEN)

    val call = Call.creator(
            PhoneNumber("+8180XXXXXXXX"), // to   080-XXXX-XXXX
            PhoneNumber("+8150XXXXXXXX"), // from 050-XXXX-XXXX
            URI("http://demo.twilio.com/docs/voice.xml")).create()

    println(call.sid)
}
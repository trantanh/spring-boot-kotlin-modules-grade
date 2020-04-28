package cz.trantanh.common.utils

import java.text.SimpleDateFormat
import java.util.*

/**
 *
 * @author Tran Tuan Anh, tran.t.anh(@)email.cz
 * 28.04.2020
 */
class DateUtils {


    companion object {

        private val ISO8601 = "yyyy-MM-dd'T'HH:mm:ss'Z'"
        /**
         *  get String format ISO8601  for date
         */
        fun getStringFormatISO8601ForDate(date: Date): String {
            val dateFormat = SimpleDateFormat(ISO8601, Locale.ENGLISH)
            dateFormat.timeZone = TimeZone.getTimeZone("UTC")
            return dateFormat.format(date)
        }
    }
}
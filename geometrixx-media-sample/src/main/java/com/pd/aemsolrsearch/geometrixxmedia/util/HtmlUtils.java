package com.pd.aemsolrsearch.geometrixxmedia.util;

import org.apache.commons.lang.StringUtils;
import org.jsoup.Jsoup;

/**
 * A simple utility class for handling HTML.
 *
 */
public class HtmlUtils {

    /**
     * Converts HTML to plain text.
     *
     * @param html
     * @return Plain text on success and an empty string otherwise.
     */
    public static String htmlToText(String html) {

        if (StringUtils.isBlank(html)) {
            return "";
        }

        return Jsoup.parse(html).text();
    }
}

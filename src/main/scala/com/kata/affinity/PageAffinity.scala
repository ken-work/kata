package com.kata.affinity

/*
 * A web server logs page views in a log file.
 * The log file consists of a line per page view.
 * A page view consists of a page id and a user id separated by a comma.
 * The affinity of any two pages is the number of distinct users who viewed both.
 *
 * An example would be:
 * bbcnews, user1
 * google,  user1
 * amazon,  user2
 * google,  user3
 * google,  user3
 * google,  user2
 * amazon,  user3
 * amazon,  user1
 * bbcnews, user3
 *
 *
 * For the above, bbcnews and google have an affinity of 2
 * bbcnews and amazon also have an affinity of 2
 * whereas google and amazon have an affinity of 3.
 *
 * Write a program with a log file as input that returns two distinct pages which have the highest affinity.
 * Note that where there is more than one correct solution, any single correct solution will suffice.
 */
object PageAffinity {}

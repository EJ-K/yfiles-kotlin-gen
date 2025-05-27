// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.lang

/**
 * A structure which represents a time span.
 * 
 * This is a convertible type that can be used with the following notation(s) in parameter lists, parameter objects or setters.
 * There are some string formats that are converted to [TimeSpan]. For example:
 * 
 * ```
 * '1s'
 * '0.5m'
 * '1h'
 * '1h 20m'
 * '1:20'
 * '1:20:30.5'
 * ```
 * It is also possible to use a [Number] which will be interpreted in milliseconds.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TimeSpan">Online Documentation</a>
 * 
 * @constructor Creates a new time span which is `ticks` milliseconds long.
 * @param [ticks] The length of the time span in milliseconds.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TimeSpan%23TimeSpan-constructor-TimeSpan(number)">Online Documentation</a>
 */
external  class TimeSpan  ( ticks: Int ) : IComparable<TimeSpan> {
/**
 * Creates a new time span with a given length.
 * @param [days] The days part of the time span.
 * @param [hours] The hour part of the time span.
 * @param [minutes] The minute part of the time span.
 * @param [seconds] The seconds part of the time span.
 * @param [milliseconds] The milliseconds part of the time span.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TimeSpan%23TimeSpan-constructor-TimeSpan(number,number,number,number,number)">Online Documentation</a>
 */
 constructor( days: Int ,
 hours: Int ,
 minutes: Int ,
 seconds: Int ,
 milliseconds: Int )

/**
 * The total milliseconds (ticks) of this time span.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TimeSpan%23totalMilliseconds">Online Documentation</a>
 */
final val totalMilliseconds: Double
/**
 * The total seconds of this time span.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TimeSpan%23totalMinutes">Online Documentation</a>
 */
final val totalMinutes: Double
/**
 * The total seconds of this time span.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TimeSpan%23totalSeconds">Online Documentation</a>
 */
final val totalSeconds: Double
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TimeSpan%23TimeSpan-method-compareTo">Online Documentation</a>
 */
 final override  operator fun compareTo( other: TimeSpan ):Int

companion object : ClassMetadata<TimeSpan> {
/**
 * Empty time span.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TimeSpan%23ZERO">Online Documentation</a>
 */
 val ZERO: TimeSpan
/**
 * Creates a [TimeSpan] instance from the given TimeSpan-like object by performing automatic type conversion.
 * @param [timeSpanLike] The object to convert to a [TimeSpan].
 * @return Either `timeSpanLike` if it is already a [TimeSpan] or a new instance, initialized to the values found in `timeSpanLike`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TimeSpan%23TimeSpan-method-from">Online Documentation</a>
 */
@JsName("from")
 final  operator fun invoke( timeSpanLike: String ):TimeSpan
/**
 * Creates a new time span with the given length in milliseconds.
 * @param [milliseconds] The length of the time span in milliseconds.
 * @return A newly created time span.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TimeSpan%23TimeSpan-method-fromMilliseconds">Online Documentation</a>
 */
 final   fun fromMilliseconds( milliseconds: Double ):TimeSpan
/**
 * Creates a new time span with the given length in minutes.
 * @param [minutes] The length of the time span in minutes.
 * @return A newly created time span.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TimeSpan%23TimeSpan-method-fromMinutes">Online Documentation</a>
 */
 final   fun fromMinutes( minutes: Double ):TimeSpan
/**
 * Creates a new time span with the given length in seconds.
 * @param [seconds] The length of the time span in seconds.
 * @return A newly created time span.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TimeSpan%23TimeSpan-method-fromSeconds">Online Documentation</a>
 */
 final   fun fromSeconds( seconds: Double ):TimeSpan
}
}

inline val Int.days: TimeSpan
    get() = (this * 24).hours

inline val Int.hours: TimeSpan
    get() = (this * 60).minutes

inline val Int.minutes: TimeSpan
    get() = (this * 60).seconds

inline val Int.seconds: TimeSpan
    get() = (this * 1000).milliseconds

inline val Int.milliseconds: TimeSpan
    get() = TimeSpan(this)

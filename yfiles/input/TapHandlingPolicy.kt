// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Enumeration used by [TapHandlingPolicy].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapHandlingPolicy">Online Documentation</a>
 */
external sealed class TapHandlingPolicy: YEnum<TapHandlingPolicy> {
   companion object: EnumMetadata<TapHandlingPolicy> {
       /**
 * Using this mode, in case of a double tap, only the double tap is reported, but neither of the two single taps.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapHandlingPolicy%23DOUBLE_TAP_ONLY">Online Documentation</a>
 */
val DOUBLE_TAP_ONLY: TapHandlingPolicy

/**
 * In this mode, in case of a double tap, only one single tap is reported and one double tap.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapHandlingPolicy%23INITIAL_SINGLE_AND_DOUBLE_TAP">Online Documentation</a>
 */
val INITIAL_SINGLE_AND_DOUBLE_TAP: TapHandlingPolicy

/**
 * In this mode, every tap (both single tap and either of the taps of a multi-tap) is reported as a single tap and every double tap is reported as a double tap.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TapHandlingPolicy%23BOTH_SINGLE_TAPS_AND_DOUBLE_TAP">Online Documentation</a>
 */
val BOTH_SINGLE_TAPS_AND_DOUBLE_TAP: TapHandlingPolicy
   }
}

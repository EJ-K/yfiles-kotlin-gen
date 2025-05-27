// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Defines types of pulse animations for use with the [WebGL2GraphModelManager.createPulseAnimation] method.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2PulseAnimationType">Online Documentation</a>
 */
external sealed class WebGL2PulseAnimationType: YEnum<WebGL2PulseAnimationType> {
   companion object: EnumMetadata<WebGL2PulseAnimationType> {
       /**
 * Pulse animation that enlarges an item or a node effect by an absolute size defined by the amount.
 * 
 * Value - `6`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2PulseAnimationType%23GROW">Online Documentation</a>
 */
val GROW: WebGL2PulseAnimationType

/**
 * Pulse animation that shrinks an item or a node effect by an absolute size defined by the amount.
 * 
 * Value - `8`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2PulseAnimationType%23SHRINK">Online Documentation</a>
 */
val SHRINK: WebGL2PulseAnimationType

/**
 * Pulse animation around the current size of an item or a node effect.
 * 
 * Value - `10`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2PulseAnimationType%23BOTH">Online Documentation</a>
 */
val BOTH: WebGL2PulseAnimationType

/**
 * Pulse animation that enlarges an item or a node effect by a factor, defined by the amount.
 * 
 * Value - `38`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2PulseAnimationType%23GROW_RELATIVE">Online Documentation</a>
 */
val GROW_RELATIVE: WebGL2PulseAnimationType

/**
 * Pulse animation that shrinks an item or a node effect by a factor, defined by the amount.
 * 
 * Value - `40`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2PulseAnimationType%23SHRINK_RELATIVE">Online Documentation</a>
 */
val SHRINK_RELATIVE: WebGL2PulseAnimationType

/**
 * Pulse animation around the current size of an item or a node effect.
 * 
 * Value - `42`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2PulseAnimationType%23BOTH_RELATIVE">Online Documentation</a>
 */
val BOTH_RELATIVE: WebGL2PulseAnimationType
   }
}

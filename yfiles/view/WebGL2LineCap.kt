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
 * The line cap style of a [WebGL2Stroke].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2LineCap">Online Documentation</a>
 */
external sealed class WebGL2LineCap: YEnum<WebGL2LineCap> {
   companion object: EnumMetadata<WebGL2LineCap> {
       /**
 * Flat line caps.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2LineCap%23FLAT">Online Documentation</a>
 */
val FLAT: WebGL2LineCap

/**
 * Round line caps.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2LineCap%23ROUND">Online Documentation</a>
 */
val ROUND: WebGL2LineCap

/**
 * Square line caps.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2LineCap%23SQUARE">Online Documentation</a>
 */
val SQUARE: WebGL2LineCap

/**
 * Triangle line caps.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2LineCap%23TRIANGLE">Online Documentation</a>
 */
val TRIANGLE: WebGL2LineCap
   }
}

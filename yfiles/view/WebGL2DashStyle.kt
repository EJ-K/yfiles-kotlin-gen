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
 * The dash style of a [WebGL2Stroke].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2DashStyle">Online Documentation</a>
 */
external sealed class WebGL2DashStyle: YEnum<WebGL2DashStyle> {
   companion object: EnumMetadata<WebGL2DashStyle> {
       /**
 * Solid dash style with no dashes.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2DashStyle%23SOLID">Online Documentation</a>
 */
val SOLID: WebGL2DashStyle

/**
 * Dash style with a single dot.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2DashStyle%23DOT">Online Documentation</a>
 */
val DOT: WebGL2DashStyle

/**
 * Dash style with a single dash.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2DashStyle%23DASH">Online Documentation</a>
 */
val DASH: WebGL2DashStyle

/**
 * Dash style with a single dash and dot.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2DashStyle%23DASH_DOT">Online Documentation</a>
 */
val DASH_DOT: WebGL2DashStyle

/**
 * Dash style with a single dash and two dots.
 * 
 * Value - `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2DashStyle%23DASH_DOT_DOT">Online Documentation</a>
 */
val DASH_DOT_DOT: WebGL2DashStyle
   }
}

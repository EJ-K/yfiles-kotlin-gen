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
 * Describes the technology used by the [WebGL2GraphModelManager] to render graph elements.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManagerRenderMode">Online Documentation</a>
 */
external sealed class WebGL2GraphModelManagerRenderMode: YEnum<WebGL2GraphModelManagerRenderMode> {
   companion object: EnumMetadata<WebGL2GraphModelManagerRenderMode> {
       /**
 * Renders in WebGL2.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManagerRenderMode%23WEB_GL">Online Documentation</a>
 */
val WEB_GL: WebGL2GraphModelManagerRenderMode

/**
 * Renders in SVG.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphModelManagerRenderMode%23SVG">Online Documentation</a>
 */
val SVG: WebGL2GraphModelManagerRenderMode
   }
}

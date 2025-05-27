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
 * Describes the technologies used to render visual elements.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RenderModes">Online Documentation</a>
 */
external sealed class RenderModes: YEnum<RenderModes> {
   companion object: EnumMetadata<RenderModes> {
       /**
 * Renders in SVG.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RenderModes%23SVG">Online Documentation</a>
 */
val SVG: RenderModes

/**
 * Renders in HTML5 canvas.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RenderModes%23CANVAS">Online Documentation</a>
 */
val CANVAS: RenderModes

/**
 * Renders in WebGL.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RenderModes%23WEB_GL">Online Documentation</a>
 */
val WEB_GL: RenderModes

/**
 * Renders in WebGL2.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RenderModes%23WEB_GL2">Online Documentation</a>
 */
val WEB_GL2: RenderModes

/**
 * Renders in the technology considered to be the best for the current situation.
 * 
 * Value - `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RenderModes%23AUTO">Online Documentation</a>
 */
val AUTO: RenderModes
   }
}

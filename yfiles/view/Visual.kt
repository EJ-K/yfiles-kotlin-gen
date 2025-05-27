// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.lang.ClassMetadata

/**
 * Base class for all objects that support drawing in the context of a [CanvasComponent].
 * @see [SvgVisual]
 * @see [HtmlVisual]
 * @see [HtmlCanvasVisual]
 * @see [WebGLVisual]
 * @see [WebGL2Visual]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Visual">Online Documentation</a>
 */
abstract external class Visual   {
  
  companion object : ClassMetadata<Visual> {
  }
}

inline operator fun <T : Visual> T.invoke(
    block: T.() -> Unit
): T = apply(block)

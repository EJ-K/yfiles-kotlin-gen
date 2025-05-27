// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import web.svg.SVGElement
import yfiles.geometry.Size
import yfiles.lang.ClassMetadata
import yfiles.view.Font
import yfiles.view.TextWrapping

/**
 * An [ILabelStyleRenderer] implementation that can handle [MarkupLabelStyle] instances.
 * @see [MarkupLabelStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarkupLabelStyleRenderer">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarkupLabelStyleRenderer%23MarkupLabelStyleRenderer-constructor-MarkupLabelStyleRenderer">Online Documentation</a>
 */
external open class MarkupLabelStyleRenderer  () : DefaultLabelStyleRenderer {

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarkupLabelStyleRenderer%23MarkupLabelStyleRenderer-method-addTextElements">Online Documentation</a>
 */
 override   fun addTextElements( textContainer: SVGElement ,
 font: Font ,
 text: String ,
 maxSize: Size ,
 wrapping: TextWrapping ,
 rightToLeft: Boolean ):String
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarkupLabelStyleRenderer%23MarkupLabelStyleRenderer-method-measureText">Online Documentation</a>
 */
 override   fun measureText( text: String ,
 font: Font ,
 maximumSize: Size ):Size

companion object : ClassMetadata<MarkupLabelStyleRenderer> {
}
}

inline fun MarkupLabelStyleRenderer(
    block: MarkupLabelStyleRenderer.() -> Unit
): MarkupLabelStyleRenderer {
    return MarkupLabelStyleRenderer()
        .apply(block)
}

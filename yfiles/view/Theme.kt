// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import js.core.Void
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * A [CanvasComponent]s [CanvasComponent.theme] is used to configure the general look and feel of its interaction visualization.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Theme">Online Documentation</a>
 * 
 * @constructor Creates a new instance with the given `variant`, colors and scale.
 * @param [variant] The [ThemeVariant] used in this theme that defines its general look and feel. Defaults to [ThemeVariant.CLASSIC].
 * @param [primaryColor] The [primaryColor] used for interaction visualization. Defaults to [Color.BLACK].
 * @param [secondaryColor] The [secondaryColor] used for interaction visualization. Defaults to a blue-ish `#3399ff`.
 * @param [backgroundColor] The [backgroundColor] used for interaction visualization. Defaults to [Color.WHITE].
 * @param [scale] The factor used to scale the size of [IHandle][yfiles.input.IHandle]s and [IPortCandidate][yfiles.input.IPortCandidate]s. Defaults to `1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Theme%23Theme-constructor-Theme">Online Documentation</a>
 */
external  class Theme  ( variant: ThemeVariant  = definedExternally,
 primaryColor: Color?  = definedExternally,
 secondaryColor: Color?  = definedExternally,
 backgroundColor: Color?  = definedExternally,
 scale: Double  = definedExternally) : YObject {

/**
 * A third color used for interaction visualization.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Theme%23backgroundColor">Online Documentation</a>
 */
final val backgroundColor: Color
/**
 * An [IVisualTemplate] that can be used to resemble the classic variant rectangle selection for nodes and labels.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Theme%23hatchRectangle">Online Documentation</a>
 */
final val hatchRectangle: IVisualTemplate<Void>
/**
 * A hatch [Stroke] that can be used to resemble the classic variant selection stroke for edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Theme%23hatchStroke">Online Documentation</a>
 */
final val hatchStroke: Stroke
/**
 * The primary color used for interaction visualization.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Theme%23primaryColor">Online Documentation</a>
 */
final val primaryColor: Color
/**
 * The factor used to scale the size of [IHandle][yfiles.input.IHandle]s and [IPortCandidate][yfiles.input.IPortCandidate]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Theme%23scale">Online Documentation</a>
 */
final val scale: Double
/**
 * The secondary color used for interaction visualization.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Theme%23secondaryColor">Online Documentation</a>
 */
final val secondaryColor: Color
/**
 * The variant used in this theme that defines its general look and feel.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Theme%23variant">Online Documentation</a>
 */
final val variant: ThemeVariant

companion object : ClassMetadata<Theme> {
}
}

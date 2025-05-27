// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.geometry.Insets
import yfiles.graph.ILabel
import yfiles.lang.ClassMetadata
import yfiles.styles.ILabelStyle

/**
 * Allows the use of an [ILabelStyle] to render the selection, highlight or focus indicator of labels.
 * @see [EdgeStyleDecorationInstaller]
 * @see [NodeStyleDecorationInstaller]
 * @see [PortStyleDecorationInstaller]
 * @see [IndicatorLabelStyleDecorator][yfiles.styles.IndicatorLabelStyleDecorator]
 * @see [GraphSelectionIndicatorManager]
 * @see [GraphFocusIndicatorManager]
 * @see [GraphHighlightIndicatorManager]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelStyleDecorationInstaller">Online Documentation</a>
 * 
 * @constructor Create a new instance of this class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelStyleDecorationInstaller%23LabelStyleDecorationInstaller-constructor-LabelStyleDecorationInstaller">Online Documentation</a>
 */
external open class LabelStyleDecorationInstaller  () : ISelectionIndicatorInstaller<ILabel>, IHighlightIndicatorInstaller<ILabel>, IFocusIndicatorInstaller<ILabel> {

/**
 * Gets or sets the style to use for the rendering.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelStyleDecorationInstaller%23labelStyle">Online Documentation</a>
 */
final var labelStyle: ILabelStyle
/**
 * Gets or sets the margins around the label layout.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelStyleDecorationInstaller%23margins">Online Documentation</a>
 */
final var margins: Insets
/**
 * Gets or sets how the style is affected by the current zoom level.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelStyleDecorationInstaller%23zoomPolicy">Online Documentation</a>
 */
final var zoomPolicy: StyleDecorationZoomPolicy
/**
 * Installs a rendering for the `item` if it is an [ILabel].
 * @param [context] The canvas context.
 * @param [group] The canvas object group to add the newly created canvas object to.
 * @param [item] The item to install.
 * @return The canvas object representing the item.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelStyleDecorationInstaller%23LabelStyleDecorationInstaller-method-addCanvasObject">Online Documentation</a>
 */
 final override   fun addCanvasObject( context: ICanvasContext ,
 group: ICanvasObjectGroup ,
 item: ILabel ):ICanvasObject?

companion object : ClassMetadata<LabelStyleDecorationInstaller> {
}
}

inline fun LabelStyleDecorationInstaller(
    block: LabelStyleDecorationInstaller.() -> Unit
): LabelStyleDecorationInstaller {
    return LabelStyleDecorationInstaller()
        .apply(block)
}

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
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.styles.INodeStyle

/**
 * Allows the use of an [INodeStyle] to render the selection, highlight or focus indicator of nodes.
 * @see [EdgeStyleDecorationInstaller]
 * @see [LabelStyleDecorationInstaller]
 * @see [PortStyleDecorationInstaller]
 * @see [IndicatorNodeStyleDecorator][yfiles.styles.IndicatorNodeStyleDecorator]
 * @see [GraphSelectionIndicatorManager]
 * @see [GraphFocusIndicatorManager]
 * @see [GraphHighlightIndicatorManager]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStyleDecorationInstaller">Online Documentation</a>
 * 
 * @constructor Create a new instance of this class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStyleDecorationInstaller%23NodeStyleDecorationInstaller-constructor-NodeStyleDecorationInstaller">Online Documentation</a>
 */
external open class NodeStyleDecorationInstaller  () : ISelectionIndicatorInstaller<INode>, IHighlightIndicatorInstaller<INode>, IFocusIndicatorInstaller<INode> {

/**
 * Gets or sets the margins around the node layout.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStyleDecorationInstaller%23margins">Online Documentation</a>
 */
final var margins: Insets
/**
 * Gets or sets the style to use for the rendering.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStyleDecorationInstaller%23nodeStyle">Online Documentation</a>
 */
final var nodeStyle: INodeStyle
/**
 * Gets or sets how the style is affected by the current zoom level.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStyleDecorationInstaller%23zoomPolicy">Online Documentation</a>
 */
final var zoomPolicy: StyleDecorationZoomPolicy
/**
 * Installs a rendering for the `item` if it is an [INode].
 * @param [context] The canvas context.
 * @param [group] The canvas object group to add the newly created canvas object to.
 * @param [item] The item to install.
 * @return The canvas object representing the item.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeStyleDecorationInstaller%23NodeStyleDecorationInstaller-method-addCanvasObject">Online Documentation</a>
 */
 final override   fun addCanvasObject( context: ICanvasContext ,
 group: ICanvasObjectGroup ,
 item: INode ):ICanvasObject?

companion object : ClassMetadata<NodeStyleDecorationInstaller> {
}
}

inline fun NodeStyleDecorationInstaller(
    block: NodeStyleDecorationInstaller.() -> Unit
): NodeStyleDecorationInstaller {
    return NodeStyleDecorationInstaller()
        .apply(block)
}

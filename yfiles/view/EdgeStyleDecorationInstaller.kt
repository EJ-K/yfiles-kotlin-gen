// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.graph.IEdge
import yfiles.lang.ClassMetadata
import yfiles.styles.IEdgeStyle

/**
 * Allows the use of an [IEdgeStyle] to render the selection, highlight or focus indicator of edges.
 * @see [NodeStyleDecorationInstaller]
 * @see [LabelStyleDecorationInstaller]
 * @see [PortStyleDecorationInstaller]
 * @see [IndicatorEdgeStyleDecorator][yfiles.styles.IndicatorEdgeStyleDecorator]
 * @see [GraphSelectionIndicatorManager]
 * @see [GraphFocusIndicatorManager]
 * @see [GraphHighlightIndicatorManager]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeStyleDecorationInstaller">Online Documentation</a>
 * 
 * @constructor Create a new instance of this class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeStyleDecorationInstaller%23EdgeStyleDecorationInstaller-constructor-EdgeStyleDecorationInstaller">Online Documentation</a>
 */
external open class EdgeStyleDecorationInstaller  () : ISelectionIndicatorInstaller<IEdge>, IHighlightIndicatorInstaller<IEdge>, IFocusIndicatorInstaller<IEdge> {

/**
 * Gets or sets the style to use for the rendering.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeStyleDecorationInstaller%23edgeStyle">Online Documentation</a>
 */
final var edgeStyle: IEdgeStyle
/**
 * Gets or sets how the style is affected by the current zoom level.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeStyleDecorationInstaller%23zoomPolicy">Online Documentation</a>
 */
final var zoomPolicy: StyleDecorationZoomPolicy
/**
 * Installs a rendering for the `item` if it is an [IEdge].
 * @param [context] The canvas context.
 * @param [group] The canvas object group to add the newly created [ICanvasObject] to.
 * @param [item] The item to install.
 * @return The canvas object representing the item.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeStyleDecorationInstaller%23EdgeStyleDecorationInstaller-method-addCanvasObject">Online Documentation</a>
 */
 final override   fun addCanvasObject( context: ICanvasContext ,
 group: ICanvasObjectGroup ,
 item: IEdge ):ICanvasObject?

companion object : ClassMetadata<EdgeStyleDecorationInstaller> {
}
}

inline fun EdgeStyleDecorationInstaller(
    block: EdgeStyleDecorationInstaller.() -> Unit
): EdgeStyleDecorationInstaller {
    return EdgeStyleDecorationInstaller()
        .apply(block)
}

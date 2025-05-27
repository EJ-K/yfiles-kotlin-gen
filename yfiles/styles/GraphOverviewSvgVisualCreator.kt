// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.view.IRenderContext
import yfiles.view.IVisualCreator
import yfiles.view.Visual

/**
 * An [IVisualCreator] for use in a [CanvasComponent][yfiles.view.CanvasComponent] that renders a [IGraph] instance in a sloppy overview style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewSvgVisualCreator">Online Documentation</a>
 * 
 * @constructor Creates a new instance for the given graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewSvgVisualCreator%23GraphOverviewSvgVisualCreator-constructor-GraphOverviewSvgVisualCreator">Online Documentation</a>
 */
external open class GraphOverviewSvgVisualCreator  ( graph: IGraph ) : IVisualCreator {

/**
 * Gets or sets the overview edge style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewSvgVisualCreator%23edgeStyle">Online Documentation</a>
 */
final var edgeStyle: IEdgeStyle?
/**
 * Gets or sets the overview group node style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewSvgVisualCreator%23groupNodeStyle">Online Documentation</a>
 */
final var groupNodeStyle: INodeStyle?
/**
 * Gets or sets the overview node style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewSvgVisualCreator%23nodeStyle">Online Documentation</a>
 */
final var nodeStyle: INodeStyle?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewSvgVisualCreator%23GraphOverviewSvgVisualCreator-method-createVisual">Online Documentation</a>
 */
 final override   fun createVisual( context: IRenderContext ):Visual?
/**
 * Returns and/or configures a edge style for the given edge to render.
 * @param [edge] The edge to render.
 * @return The style or `null` if no visualization should be drawn.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewSvgVisualCreator%23GraphOverviewSvgVisualCreator-method-getEdgeStyle">Online Documentation</a>
 */
 open protected   fun getEdgeStyle( edge: IEdge ):IEdgeStyle?
/**
 * Obtains the [IVisualCreator] for the given edge.
 * @param [context] The context.
 * @param [edge] The edge.
 * @return The visual creator that is obtained from the [getEdgeStyle]'s [IEdgeStyleRenderer.getVisualCreator] method.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewSvgVisualCreator%23GraphOverviewSvgVisualCreator-method-getEdgeVisualCreator">Online Documentation</a>
 */
 open protected   fun getEdgeVisualCreator( context: IRenderContext ,
 edge: IEdge ):IVisualCreator?
/**
 * Returns and/or configures a group node style for the given node to render.
 * @param [node] The group node to render.
 * @return The style or `null` if no visualization should be drawn.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewSvgVisualCreator%23GraphOverviewSvgVisualCreator-method-getGroupNodeStyle">Online Documentation</a>
 */
 open protected   fun getGroupNodeStyle( node: INode ):INodeStyle?
/**
 * Obtains the [IVisualCreator] for the given group node.
 * @param [context] The context.
 * @param [node] The group node.
 * @return The visual creator that is obtained from the [getGroupNodeStyle]'s [INodeStyleRenderer.getVisualCreator] method.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewSvgVisualCreator%23GraphOverviewSvgVisualCreator-method-getGroupNodeVisualCreator">Online Documentation</a>
 */
 open protected   fun getGroupNodeVisualCreator( context: IRenderContext ,
 node: INode ):IVisualCreator?
/**
 * Returns and/or configures a node style for the given node to render.
 * @param [node] The node to render.
 * @return The style or `null` if no visualization should be drawn.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewSvgVisualCreator%23GraphOverviewSvgVisualCreator-method-getNodeStyle">Online Documentation</a>
 */
 open protected   fun getNodeStyle( node: INode ):INodeStyle?
/**
 * Obtains the [IVisualCreator] for the given node.
 * @param [context] The context.
 * @param [node] The node.
 * @return The visual creator that is obtained from the [getNodeStyle]'s [INodeStyleRenderer.getVisualCreator] method.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewSvgVisualCreator%23GraphOverviewSvgVisualCreator-method-getNodeVisualCreator">Online Documentation</a>
 */
 open protected   fun getNodeVisualCreator( context: IRenderContext ,
 node: INode ):IVisualCreator?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewSvgVisualCreator%23GraphOverviewSvgVisualCreator-method-updateVisual">Online Documentation</a>
 */
 final override   fun updateVisual( context: IRenderContext ,
 oldVisual: Visual? ):Visual?

companion object : ClassMetadata<GraphOverviewSvgVisualCreator> {
}
}

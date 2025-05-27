// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import web.canvas.CanvasRenderingContext2D
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.INode
import yfiles.lang.ClassMetadata

/**
 * An [IVisualCreator] for use in a [CanvasComponent] that renders a [IGraph] instance in a sloppy overview style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewCanvasVisualCreator">Online Documentation</a>
 * 
 * @constructor Creates a new instance for the given graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewCanvasVisualCreator%23GraphOverviewCanvasVisualCreator-constructor-GraphOverviewCanvasVisualCreator">Online Documentation</a>
 */
external open class GraphOverviewCanvasVisualCreator  ( graph: IGraph ) : IVisualCreator {

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewCanvasVisualCreator%23GraphOverviewCanvasVisualCreator-method-createVisual">Online Documentation</a>
 */
 final override   fun createVisual( context: IRenderContext ):Visual?
/**
 * Callback that paints the specified `edge`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewCanvasVisualCreator%23GraphOverviewCanvasVisualCreator-method-paintEdge">Online Documentation</a>
 */
 open protected   fun paintEdge( renderContext: IRenderContext ,
 ctx: CanvasRenderingContext2D ,
 edge: IEdge )
/**
 * Callback method that paints the specified `node`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewCanvasVisualCreator%23GraphOverviewCanvasVisualCreator-method-paintGroupNode">Online Documentation</a>
 */
 open protected   fun paintGroupNode( renderContext: IRenderContext ,
 ctx: CanvasRenderingContext2D ,
 node: INode )
/**
 * Callback method that paints the specified `node`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewCanvasVisualCreator%23GraphOverviewCanvasVisualCreator-method-paintNode">Online Documentation</a>
 */
 open protected   fun paintNode( renderContext: IRenderContext ,
 ctx: CanvasRenderingContext2D ,
 node: INode )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphOverviewCanvasVisualCreator%23GraphOverviewCanvasVisualCreator-method-updateVisual">Online Documentation</a>
 */
 final override   fun updateVisual( context: IRenderContext ,
 oldVisual: Visual? ):Visual?

companion object : ClassMetadata<GraphOverviewCanvasVisualCreator> {
}
}

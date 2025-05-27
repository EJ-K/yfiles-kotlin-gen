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
import yfiles.graph.IGraph
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.styles.IEdgeStyle
import yfiles.styles.INodeStyle

/**
 * An [IVisualCreator] for use in a [GraphOverviewComponent] that renders an [IGraph] instance using WebGL2.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphOverviewVisualCreator">Online Documentation</a>
 * 
 * @constructor Creates a new instance for the given graph.
 * @param [graph] The graph to create the visual creator for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphOverviewVisualCreator%23WebGL2GraphOverviewVisualCreator-constructor-WebGL2GraphOverviewVisualCreator">Online Documentation</a>
 */
external open class WebGL2GraphOverviewVisualCreator  ( graph: IGraph ) : IVisualCreator {

/**
 * Gets or sets the overview edge style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphOverviewVisualCreator%23edgeStyle">Online Documentation</a>
 */
final var edgeStyle: IEdgeStyle /* WebGL2PolylineEdgeStyle | WebGL2ArcEdgeStyle | WebGL2BridgeEdgeStyle */?
/**
 * Gets or sets the overview group node style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphOverviewVisualCreator%23groupNodeStyle">Online Documentation</a>
 */
final var groupNodeStyle: INodeStyle /* WebGL2ShapeNodeStyle | WebGL2IconNodeStyle | WebGL2GroupNodeStyle */?
/**
 * Gets or sets the overview node style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphOverviewVisualCreator%23nodeStyle">Online Documentation</a>
 */
final var nodeStyle: INodeStyle /* WebGL2ShapeNodeStyle | WebGL2IconNodeStyle | WebGL2GroupNodeStyle */?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphOverviewVisualCreator%23WebGL2GraphOverviewVisualCreator-method-createVisual">Online Documentation</a>
 */
 final override   fun createVisual( context: IRenderContext ):Visual?
/**
 * Gets a WebGL2 edge style that is similar to the [IEdgeStyle] of the given `edge`.
 * @param [edge] The edge from the [IGraph].
 * @return A (possibly shared) instance of either a [WebGL2PolylineEdgeStyle]s, [WebGL2ArcEdgeStyle], or [WebGL2BridgeEdgeStyle]. Returning `null` will apply a default style instead.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphOverviewVisualCreator%23WebGL2GraphOverviewVisualCreator-method-getWebGL2EdgeStyle">Online Documentation</a>
 */
 open protected   fun getWebGL2EdgeStyle( edge: IEdge ):IEdgeStyle /* WebGL2PolylineEdgeStyle | WebGL2ArcEdgeStyle | WebGL2BridgeEdgeStyle */?
/**
 * Gets a WebGL2 group node style that is similar to the [INodeStyle] of the given `node`.
 * @param [node] The group node from the [IGraph].
 * @return A (possibly shared) instance of either a [WebGL2ShapeNodeStyle], [WebGL2IconNodeStyle], or [WebGL2GroupNodeStyle]. Returning `null` will apply a default style instead.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphOverviewVisualCreator%23WebGL2GraphOverviewVisualCreator-method-getWebGL2GroupNodeStyle">Online Documentation</a>
 */
 open protected   fun getWebGL2GroupNodeStyle( node: INode ):INodeStyle /* WebGL2ShapeNodeStyle | WebGL2IconNodeStyle | WebGL2GroupNodeStyle */?
/**
 * Gets a WebGL2 node style that is similar to the [INodeStyle] of the given `node`.
 * @param [node] The node from the [IGraph].
 * @return A (possibly shared) instance of either a [WebGL2ShapeNodeStyle], [WebGL2IconNodeStyle], or [WebGL2GroupNodeStyle]. Returning `null` will apply a default style instead.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphOverviewVisualCreator%23WebGL2GraphOverviewVisualCreator-method-getWebGL2NodeStyle">Online Documentation</a>
 */
 open protected   fun getWebGL2NodeStyle( node: INode ):INodeStyle /* WebGL2ShapeNodeStyle | WebGL2IconNodeStyle | WebGL2GroupNodeStyle */?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2GraphOverviewVisualCreator%23WebGL2GraphOverviewVisualCreator-method-updateVisual">Online Documentation</a>
 */
 final override   fun updateVisual( context: IRenderContext ,
 oldVisual: Visual? ):Visual?

companion object : ClassMetadata<WebGL2GraphOverviewVisualCreator> {
}
}

// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import js.array.ReadonlyArray
import yfiles.algorithms.Edge
import yfiles.algorithms.EdgeList
import yfiles.algorithms.IDataProvider
import yfiles.algorithms.IEdgeCursor
import yfiles.algorithms.INodeCursor
import yfiles.algorithms.Node
import yfiles.algorithms.NodeList
import yfiles.algorithms.Rectangle2D
import yfiles.algorithms.YDimension
import yfiles.algorithms.YOrientedRectangle
import yfiles.algorithms.YPoint
import yfiles.algorithms.YPointPath
import yfiles.algorithms.YRectangle
import yfiles.graph.ILabelModelParameter

/**
 * The [LayoutGraphUtilities] provides several helper and utility functions for [LayoutGraph] and the [layout algorithms][ILayoutAlgorithm].
 * @see [LayoutGraph]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities">Online Documentation</a>
 */
external object LayoutGraphUtilities {
/**
 * Aligns the specified nodes either vertically or horizontally according to the specified node alignment mode.
 * @receiver the graph that contains the specified nodes
 * @param [nodes] the subset of the specified graph's nodes that is arranged
 * @param [referenceNode] if `null`, the common coordinate for aligning the specified nodes is calculated as the the vertical minimum (top-aligned), the vertical center, the vertical maximum (bottom-aligned), the horizontal minimum (left-aligned), the horizontal center, or the horizontal maximum (right-aligned) of the bounds of the specified nodes; otherwise the appropriate coordinate of the given reference node's bounds is used as common coordinate for aligning the specified nodes. The reference node is ignored when [distributing][NodeAlignment.DISTRIBUTED] nodes.
 * @param [vertical] `true` if nodes should be aligned (or distributed) according to their y-coordinates; otherwise nodes are aligned (or distributed) according to their x-coordinates.
 * @param [mode] one of the valid alignment modes
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-alignNodeLayouts">Online Documentation</a>
 */
 final   fun LayoutGraph.alignNodeLayouts( nodes: NodeList ,
 referenceNode: Node ,
 vertical: Boolean ,
 mode: NodeAlignment )
/**
 * Reassigns the bounds of the rectangles in a grid to fit in a large rectangle with an aspect ratio close to the specified aspect ratio.
 * @param [rectangles] the rectangles whose coordinates will be modified
 * @param [finalRect] the exact dimension will be placed in this rectangle
 * @param [aspectRatio] the preferred aspect ratio of the grid
 * @return the dimension of the grid
 * @throws ArgumentError if the given aspect ratio is less than or equal to zero
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-arrangeRectangleGrid">Online Documentation</a>
 */
 final   fun arrangeRectangleGrid( rectangles: ReadonlyArray<Rectangle2D> ,
 finalRect: Rectangle2D ,
 aspectRatio: Double ):YDimension
/**
 * Reassigns the bounds of the rectangles in multiple rows to fit the preferred width and height.
 * @param [rectangles] the rectangles to arrange (coordinates will be assigned)
 * @param [finalRect] the exact resulting dimension will be stored in this rectangle
 * @param [preferredWidth] the preferred width of the result rectangle
 * @param [preferredHeight] the preferred height of the result rectangle
 * @param [compaction] `true` if the algorithm tries to always minimize the resulting dimension, whilst respecting the given constraints, `false` otherwise
 * @param [constraintMode] the width or height constraints to consider
 * @param [alignment] the alignment inside a row
 * @return the number of rows used
 * @see [arrangeRectangleMultiRows]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-arrangeRectangleMultiRows">Online Documentation</a>
 */
 final   fun arrangeRectangleMultiRows( rectangles: ReadonlyArray<Rectangle2D> ,
 finalRect: Rectangle2D ,
 preferredWidth: Double ,
 preferredHeight: Double ,
 compaction: Boolean ,
 constraintMode: MultiRowConstraint ,
 alignment: RowAlignment  = definedExternally):Int
/**
 * Reassigns the bounds of the rectangles to fit in a large rectangle with an aspect ratio close to the specified aspect ratio.
 * @param [rectangles] the rectangles whose coordinates will be modified
 * @param [finalRect] the exact dimension of the resulting rectangle
 * @param [aspectRatio] the preferred aspect ratio of the resulting rectangle
 * @param [alignment] one of the valid row alignments
 * @return the number of used rows
 * @throws ArgumentError if the aspect ratio is `0` or less
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-arrangeRectangleRows">Online Documentation</a>
 */
 final   fun arrangeRectangleRows( rectangles: ReadonlyArray<Rectangle2D> ,
 finalRect: Rectangle2D ,
 aspectRatio: Double ,
 alignment: RowAlignment  = definedExternally):Int
/**
 * Applies the reversed layout of the first edge to the second edge.
 * @receiver the graph to which both edges belong
 * @param [edge1] the edge which adopts the points
 * @param [edge2] the template
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-assignReverseLayout">Online Documentation</a>
 */
 final   fun LayoutGraph.assignReverseLayout( edge1: Edge ,
 edge2: Edge )
/**
 * Flips the orientation of a given rectangle, if its up vector points downward `(`[upY][YOrientedRectangle.upY]` > 0)`.
 * @param [rect] the given rectangle
 * @return `true` if the given rectangle was flipped, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-autoFlipBox">Online Documentation</a>
 */
 final   fun autoFlipBox( rect: YOrientedRectangle ):Boolean
/**
 * Clips the path of the given edge on the bounding box of the source and target points.
 * @receiver the graph to which the edge belongs
 * @param [edge] the edge to clip
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-clipEdgeOnBounds">Online Documentation</a>
 */
 final   fun LayoutGraph.clipEdgeOnBounds( edge: Edge )
/**
 * Returns the path of an edge clipped on the bounding box of the source and target node.
 * @receiver the graph to which the edge belongs
 * @param [edge] the clipped edge
 * @return the clipped path of the edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-clipEdgePathOnBounds(LayoutGraph,Edge)">Online Documentation</a>
 */
 final   fun LayoutGraph.clipEdgePathOnBounds( edge: Edge ):YPointPath
/**
 * Returns the path of an edge clipped on insets of the bounding box of the source and target node.
 * @param [edge] the clipped edge
 * @param [source] the source of the edge
 * @param [target] the target of the edge
 * @param [inset] the inset of the node
 * @return the clipped path of the edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-clipEdgePathOnBounds(IEdgeLayout,INodeLayout,INodeLayout,number)">Online Documentation</a>
 */
 final   fun clipEdgePathOnBounds( edge: IEdgeLayout ,
 source: INodeLayout ,
 target: INodeLayout ,
 inset: Double  = definedExternally):YPointPath
/**
 * Clips the path of all edges in the graph on the bounding box of their source and target points.
 * @receiver the graph
 * @see [clipEdgeOnBounds]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-clipEdgesOnBounds">Online Documentation</a>
 */
 final   fun LayoutGraph.clipEdgesOnBounds()
/**
 * Returns the path of a given edge path clipped on the given bounding boxes of the source and target node.
 * @param [path] the path that will be clipped
 * @param [sourceBox] the box of the source node that the given path should be clipped at
 * @param [targetBox] the box of the target node that the given path should be clipped at
 * @return the path clipped on the given nodes boxes
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-clipPathOnBounds">Online Documentation</a>
 */
 final   fun clipPathOnBounds( path: YPointPath ,
 sourceBox: YRectangle ,
 targetBox: YRectangle ):YPointPath
/**
 * Determines the main direction of the edge flow by analyzing the current layout of the graph.
 * @receiver the underlying graph
 * @param [considerEdges] the edges to consider
 * @return one of the predefined flow directions
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-determineEdgeFlowDirection">Online Documentation</a>
 */
 final   fun LayoutGraph.determineEdgeFlowDirection( considerEdges: IDataProvider<Edge, Boolean> ):EdgeFlow
/**
 * Returns a [String] representation of the path of the given edge.
 * @receiver the graph to which the edge belongs
 * @param [edge] the edge
 * @return the [String] that contains all control points of the edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-edgeLayoutString">Online Documentation</a>
 */
 final   fun LayoutGraph.edgeLayoutString( edge: Edge ):String
/**
 * Returns the bounding box of the given edge.
 * @receiver the graph that contains the edge
 * @param [edge] the edge
 * @return the bounding box of the edge
 * @see [LayoutGraph.getSourcePointAbs]
 * @see [LayoutGraph.getTargetPointAbs]
 * @see [LayoutGraph.getLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-getBoundingBox(LayoutGraph,Edge)">Online Documentation</a>
 */
 final   fun LayoutGraph.getBoundingBox( edge: Edge ):Rectangle2D
/**
 * Returns the bounding box of the nodes and edges accessible through the given cursors.
 * @receiver the graph that contains the nodes and edges
 * @param [nodes] the nodes to include in the bounding box
 * @param [edges] the edges to include in the bounding box
 * @return the bounding box containing the given nodes and edges
 * @see [getBoundingBoxOfEdges]
 * @see [getBoundingBoxOfNodes]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-getBoundingBox(LayoutGraph,INodeCursor,IEdgeCursor)">Online Documentation</a>
 */
 final   fun LayoutGraph.getBoundingBox( nodes: INodeCursor ,
 edges: IEdgeCursor ):Rectangle2D
/**
 * Returns the bounding box of the nodes and edges accessible through the given cursors, optionally including node labels and edge labels.
 * @receiver the graph that contains the given nodes and edges
 * @param [nodes] the nodes to include in the bounding box
 * @param [edges] the edges to include in the bounding box
 * @param [includeLabels] `true` if labels of nodes and edges should be included, `false` otherwise
 * @return the bounding box of the given nodes and edges
 * @see [getBoundingBox]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-getBoundingBox(LayoutGraph,INodeCursor,IEdgeCursor,boolean)">Online Documentation</a>
 */
 final   fun LayoutGraph.getBoundingBox( nodes: INodeCursor ,
 edges: IEdgeCursor ,
 includeLabels: Boolean ):Rectangle2D
/**
 * Returns the bounding box of the nodes and edges accessible through the given cursors, optionally including node labels, edge labels or [NodeHalo]s.
 * @receiver the graph that contains the given nodes and edges
 * @param [nodes] the nodes to include in the bounding box
 * @param [edges] the edges to include in the bounding box
 * @param [includeNodeLabels] `true` if labels of nodes should be included, `false` otherwise
 * @param [includeEdgeLabels] `true` if labels of edges should be included, `false` otherwise
 * @param [includeHalos] `true` if [NodeHalo]s should be included, `false` otherwise
 * @return the bounding box of the given nodes and edges
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-getBoundingBox(LayoutGraph,INodeCursor,IEdgeCursor,boolean,boolean,boolean)">Online Documentation</a>
 */
 final   fun LayoutGraph.getBoundingBox( nodes: INodeCursor ,
 edges: IEdgeCursor ,
 includeNodeLabels: Boolean ,
 includeEdgeLabels: Boolean ,
 includeHalos: Boolean  = definedExternally):Rectangle2D
/**
 * Returns the bounding box of the edges accessible through the given cursor.
 * @receiver the graph that contains the edges
 * @param [edges] the edges to include in the bounding box
 * @return the bounding box containing the given edges
 * @see [LayoutGraph.getSourcePointAbs]
 * @see [LayoutGraph.getTargetPointAbs]
 * @see [LayoutGraph.getLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-getBoundingBoxOfEdges">Online Documentation</a>
 */
 final   fun LayoutGraph.getBoundingBoxOfEdges( edges: IEdgeCursor ):Rectangle2D
/**
 * Returns the bounding box of the nodes accessible through the given cursor.
 * @receiver the graph that contains the nodes
 * @param [nodes] the nodes to include in the bounding box
 * @return the bounding box containing the given nodes
 * @see [LayoutGraph.getLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-getBoundingBoxOfNodes">Online Documentation</a>
 */
 final   fun LayoutGraph.getBoundingBoxOfNodes( nodes: INodeCursor ):Rectangle2D
/**
 * Returns the [ILabelLayoutFactory] for the given graph.
 * @receiver the graph
 * @return the label factory of the graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-getLabelFactory">Online Documentation</a>
 */
 final   fun LayoutGraph.getLabelFactory():ILabelLayoutFactory
/**
 * Returns the upper-left corner of the paraxial bounding box of the given node label as encoded by the specified model parameter.
 * @param [model] the [INodeLabelLayoutModel] used for placing the label
 * @param [labelSize] the size of the label
 * @param [nodeLayout] the layout of the node to which the label belongs
 * @param [param] the model parameter
 * @return the upper-left corner of the label's bounding box
 * @see [INodeLabelLayoutModel.getLabelPlacement]
 * @see [YOrientedRectangle.boundingBox]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-getLabelPlacement(INodeLabelLayoutModel,YDimension,INodeLayout,Object)">Online Documentation</a>
 */
 final   fun getLabelPlacement( model: INodeLabelLayoutModel ,
 labelSize: YDimension ,
 nodeLayout: INodeLayout ,
 param: ILabelModelParameter ):YPoint
/**
 * Returns the upper-left corner of the paraxial bounding box of the given edge label as encoded by the specified model parameter.
 * @param [model] the [IEdgeLabelLayoutModel] used for placing the label
 * @param [labelSize] the size of the label that should be placed
 * @param [edgeLayout] the layout of the edge to which the label belongs
 * @param [sourceLayout] the layout of the edge's source node
 * @param [targetLayout] the layout of the edge's target node
 * @param [param] the model parameter
 * @return the upper-left corner of the label's bounding box
 * @see [IEdgeLabelLayoutModel.getLabelPlacement]
 * @see [YOrientedRectangle.boundingBox]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-getLabelPlacement(IEdgeLabelLayoutModel,YDimension,IEdgeLayout,INodeLayout,INodeLayout,Object)">Online Documentation</a>
 */
 final   fun getLabelPlacement( model: IEdgeLabelLayoutModel ,
 labelSize: YDimension ,
 edgeLayout: IEdgeLayout ,
 sourceLayout: INodeLayout ,
 targetLayout: INodeLayout ,
 param: ILabelModelParameter ):YPoint
/**
 * Returns the distance between the centers of the two given nodes.
 * @receiver the graph to which the nodes belong
 * @param [node1] the first node
 * @param [node2] the second node
 * @return the distance between the nodes' centers
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-getNodeDistance">Online Documentation</a>
 */
 final   fun LayoutGraph.getNodeDistance( node1: Node ,
 node2: Node ):Double
/**
 * Returns a [String] representation of all node positions in the graph.
 * @receiver the graph
 * @return the [String] containing all node locations
 * @see [LayoutGraph.getLocation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-getNodePositions">Online Documentation</a>
 */
 final   fun LayoutGraph.getNodePositions():String
/**
 * Returns the length of the path of the given edge.
 * @receiver the graph to which the edge belongs
 * @param [edge] the edge
 * @return the length of the edge's path
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-getPathLength">Online Documentation</a>
 */
 final   fun LayoutGraph.getPathLength( edge: Edge ):Double
/**
 * Checks whether or not the path of an edge is outside the bounding box of the source and target node.
 * @receiver the graph to which the edge belongs
 * @param [edge] the edge
 * @return `true` if the edge is outside the nodes, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-isEdgeOutsideNodes(LayoutGraph,Edge)">Online Documentation</a>
 */
 final   fun LayoutGraph.isEdgeOutsideNodes( edge: Edge ):Boolean
/**
 * Checks whether or not the path of an edge is outside the bounding box of the source and target node, considering the given halo.
 * @param [edge] the edge
 * @param [source] the source of the edge
 * @param [target] the target of the edge
 * @param [halo] the halo for the nodes
 * @return `true` if the edge is outside the nodes, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-isEdgeOutsideNodes(IEdgeLayout,INodeLayout,INodeLayout,number)">Online Documentation</a>
 */
 final   fun isEdgeOutsideNodes( edge: IEdgeLayout ,
 source: INodeLayout ,
 target: INodeLayout ,
 halo: Double ):Boolean
/**
 * Determines whether or not most of the edges of the graph are routed octilinear.
 * @receiver the underlying graph
 * @param [considerEdges] the edges to consider
 * @return `true` if most of the edges in the graph are routed octilinear, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-isUsingOctilinearEdgeRoutes">Online Documentation</a>
 */
 final   fun LayoutGraph.isUsingOctilinearEdgeRoutes( considerEdges: IDataProvider<Edge, Boolean> ):Boolean
/**
 * Determines whether or not most of the edges of the graph are routed orthogonally.
 * @receiver the underlying graph
 * @param [considerEdges] the edges to consider
 * @return `true` if most of the edges in the graph are routed orthogonally, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-isUsingOrthogonalEdgeRoutes">Online Documentation</a>
 */
 final   fun LayoutGraph.isUsingOrthogonalEdgeRoutes( considerEdges: IDataProvider<Edge, Boolean> ):Boolean
/**
 * Moves all control points of the given edge by the vector `(dx,dy)`.
 * @receiver the graph
 * @param [edge] the edge
 * @param [dx] the horizontal distance to move
 * @param [dy] the vertical distance to move
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-moveEdge">Online Documentation</a>
 */
 final   fun LayoutGraph.moveEdge( edge: Edge ,
 dx: Double ,
 dy: Double )
/**
 * Moves the control points of all edges accessible through the given [IEdgeCursor] by the vector `(dx,dy)`.
 * @receiver the graph
 * @param [edges] the edges to be moved
 * @param [dx] the horizontal distance to move
 * @param [dy] the vertical distance to move
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-moveEdges">Online Documentation</a>
 */
 final   fun LayoutGraph.moveEdges( edges: IEdgeCursor ,
 dx: Double ,
 dy: Double )
/**
 * Moves the given node by the vector `(dx,dy)`.
 * @receiver the graph
 * @param [node] the node
 * @param [dx] the horizontal distance to move
 * @param [dy] the vertical distance to move
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-moveNode">Online Documentation</a>
 */
 final   fun LayoutGraph.moveNode( node: Node ,
 dx: Double ,
 dy: Double )
/**
 * Moves all nodes accessible through the given [INodeCursor] by the vector `(dx,dy)`.
 * @receiver the graph
 * @param [nodes] the nodes to be moved
 * @param [dx] the horizontal distance to move
 * @param [dy] the vertical distance to move
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-moveNodes">Online Documentation</a>
 */
 final   fun LayoutGraph.moveNodes( nodes: INodeCursor ,
 dx: Double ,
 dy: Double )
/**
 * Moves the subgraph induced by the nodes accessible through the given [INodeCursor] by the vector `(dx,dy)`.
 * @receiver the graph that contains the subgraph
 * @param [nodes] the nodes that induce the subgraph
 * @param [dx] the horizontal distance to move
 * @param [dy] the vertical distance to move
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-moveSubgraph">Online Documentation</a>
 */
 final   fun LayoutGraph.moveSubgraph( nodes: INodeCursor ,
 dx: Double ,
 dy: Double )
/**
 * Moves the subgraph induced by the edges accessible through the given [IEdgeCursor] by the vector `(dx,dy)`.
 * @receiver the graph that contains the subgraph
 * @param [edges] the edges that induce the subgraph
 * @param [dx] the horizontal distance to move
 * @param [dy] the vertical distance to move
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-moveSubgraphOfEdges">Online Documentation</a>
 */
 final   fun LayoutGraph.moveSubgraphOfEdges( edges: IEdgeCursor ,
 dx: Double ,
 dy: Double )
/**
 * Checks whether or not the path of the given edge intersects the interior of a given rectangular area.
 * @receiver the graph to which the edge belongs
 * @param [edge] the edge
 * @param [rect] the rectangular area to check for intersection
 * @return `true` if the edge path intersects with the given rectangle, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-pathIntersectsRect">Online Documentation</a>
 */
 final   fun LayoutGraph.pathIntersectsRect( edge: Edge ,
 rect: Rectangle2D ):Boolean
/**
 * Removes successive bends that have the same coordinates from all edges in the graph.
 * @receiver the graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-removeDuplicateBends(LayoutGraph)">Online Documentation</a>
 */
 final   fun LayoutGraph.removeDuplicateBends()
/**
 * Removes successive bends that have the same coordinates from the given edge.
 * @receiver the graph
 * @param [edge] the edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-removeDuplicateBends(LayoutGraph,Edge)">Online Documentation</a>
 */
 final   fun LayoutGraph.removeDuplicateBends( edge: Edge )
/**
 * Assigns a trivial path which has no control points to the specified edge.
 * @receiver the graph
 * @param [edge] the edge
 * @param [resetPorts] `true` if the ports of the edge should be set to the center of the corresponding nodes, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-resetPath">Online Documentation</a>
 */
 final   fun LayoutGraph.resetPath( edge: Edge ,
 resetPorts: Boolean  = definedExternally)
/**
 * Assigns a trivial path which has no control points to all edges in the specified graph.
 * @receiver the graph
 * @param [resetPorts] `true` if the ports of the edges should be set to the center of the corresponding nodes, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-resetPaths">Online Documentation</a>
 */
 final   fun LayoutGraph.resetPaths( resetPorts: Boolean  = definedExternally)
/**
 * Sets the ports of all edges in the graph to the center of the nodes.
 * @receiver the graph
 * @see [LayoutGraph.setSourcePointRel]
 * @see [LayoutGraph.setTargetPointRel]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-resetPorts">Online Documentation</a>
 */
 final   fun LayoutGraph.resetPorts()
/**
 * Reverses the layout of an edge.
 * @receiver the layout information of an edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-reverseEdgeLayout">Online Documentation</a>
 */
 final   fun IEdgeLayout.reverseEdgeLayout()
/**
 * Rounds the locations of the control points and ports of the given edge to integer values.
 * @receiver the graph to which the edge belongs
 * @param [edge] the edge whose values are rounded
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-roundEdgeLayout">Online Documentation</a>
 */
 final   fun LayoutGraph.roundEdgeLayout( edge: Edge )
/**
 * Rounds coordinates and sizes in the layout of an entire graph to integer values.
 * @receiver the graph
 * @see [roundNodeLayout]
 * @see [roundEdgeLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-roundLayout">Online Documentation</a>
 */
 final   fun LayoutGraph.roundLayout()
/**
 * Rounds the location and size of the given node to integer values.
 * @receiver the graph to which the node belongs
 * @param [node] the node whose values are rounded
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-roundNodeLayout">Online Documentation</a>
 */
 final   fun LayoutGraph.roundNodeLayout( node: Node )
/**
 * Routes two edges which are incident to the same nodes in parallel, optionally joining the end points.
 * @receiver the graph
 * @param [leadingEdge] the leading edge
 * @param [edge] the edge to be adjusted
 * @param [lineDistance] the distance between the two edges
 * @param [joinEnds] `true` if the edges should share their end points (the ones of the leading edge), `false` otherwise
 * @param [absJoinDistance] the absolute distance between the end points and the beginning of the parallel segment routing if the ends are joined
 * @param [relJoinDistance] the relative distance, measured relative to the length of the first/last segments if the ends are joined
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-routeEdgesParallel(LayoutGraph,Edge,Edge,number,boolean,number,number)">Online Documentation</a>
 */
 final   fun LayoutGraph.routeEdgesParallel( leadingEdge: Edge ,
 edge: Edge ,
 lineDistance: Double ,
 joinEnds: Boolean  = definedExternally,
 absJoinDistance: Double  = definedExternally,
 relJoinDistance: Double  = definedExternally)
/**
 * Routes a list of edges which are incident to the same nodes in parallel, optionally joining the end points.
 * @receiver the graph
 * @param [leadingEdge] the leading edge
 * @param [edges] the list of edges that will be aligned with the leading edge
 * @param [lineDistance] the distance between two edges
 * @param [adjustLeadingEdge] `true` if the leading edge should be adjusted if the size of list is odd, `false` otherwise
 * @param [joinEnds] `true` if the edges should share their end points (the ones of the leading edge), `false` otherwise
 * @param [absJoinDistance] the absolute distance between the end points and the beginning of the parallel segment routing if the ends are joined
 * @param [relJoinDistance] the relative distance, measured relative to the length of the first/last segments if the ends are joined
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-routeEdgesParallel(LayoutGraph,Edge,EdgeList,number,boolean,boolean,number,number)">Online Documentation</a>
 */
 final   fun LayoutGraph.routeEdgesParallel( leadingEdge: Edge ,
 edges: EdgeList ,
 lineDistance: Double ,
 adjustLeadingEdge: Boolean  = definedExternally,
 joinEnds: Boolean  = definedExternally,
 absJoinDistance: Double  = definedExternally,
 relJoinDistance: Double  = definedExternally)
/**
 * Routes a self-loop.
 * @receiver the graph to which the edge belongs
 * @param [edge] the self-loop
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraphUtilities%23LayoutGraphUtilities-method-routeSelfLoop">Online Documentation</a>
 */
 final   fun LayoutGraph.routeSelfLoop( edge: Edge )
}

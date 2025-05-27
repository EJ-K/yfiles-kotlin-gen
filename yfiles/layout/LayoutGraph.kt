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
import yfiles.algorithms.Graph
import yfiles.algorithms.ICursor
import yfiles.algorithms.Node
import yfiles.algorithms.YDimension
import yfiles.algorithms.YList
import yfiles.algorithms.YPoint
import yfiles.algorithms.YPointPath
import yfiles.algorithms.YRectangle
import yfiles.lang.ClassMetadata

/**
 * A [LayoutGraph] is a [Graph] with attached layout information that basically represents a drawing of a graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph">Online Documentation</a>
 * 
 * @constructor Creates a new, empty [LayoutGraph] with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-constructor-LayoutGraph()">Online Documentation</a>
 */
external abstract class LayoutGraph  () : Graph {
/**
 * Creates a new [LayoutGraph] which is a copy of the given subgraph.
 * @param [subgraph] the original subgraph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-constructor-LayoutGraph(LayoutGraph)">Online Documentation</a>
 */
 constructor( subgraph: LayoutGraph )
/**
 * Creates a new [LayoutGraph] which is a copy of the given subgraph.
 * @param [graph] the original graph
 * @param [nodeSubset] the nodes that induce the subgraph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-constructor-LayoutGraph(LayoutGraph,ICursor)">Online Documentation</a>
 */
 constructor( graph: LayoutGraph ,
 nodeSubset: ICursor<Node> )

/**
 * Gets a list of all edges in the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23edgeList">Online Documentation</a>
 */
open val edgeList: EdgeList
/**
 * Creates a new [ILabelLayoutFactory] for this [LayoutGraph] that can be used for copying layout information of labels.
 * @return the new [ILabelLayoutFactory]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-createLabelFactory">Online Documentation</a>
 */
 abstract protected   fun createLabelFactory():ILabelLayoutFactory
/**
 * Returns the rectangle describing the bounding box of the given node.
 * @param [node] the node
 * @return the bounds of the node
 * @see [getLocation]
 * @see [getSize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-getBoundingBox">Online Documentation</a>
 */
 open   fun getBoundingBox( node: Node ):YRectangle
/**
 * Returns the center coordinates of the given node.
 * @param [node] the node
 * @return the location of the node's center
 * @see [INodeLayout]
 * @see [setCenter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-getCenter">Online Documentation</a>
 */
 open   fun getCenter( node: Node ):YPoint
/**
 * Returns the x-coordinate of the given node's center.
 * @param [node] the node
 * @return the x-value of the node's center coordinate
 * @see [INodeLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-getCenterX">Online Documentation</a>
 */
 open   fun getCenterX( node: Node ):Double
/**
 * Returns the y-coordinate of the given node's center.
 * @param [node] the node
 * @return the y-value of the node's center coordinate
 * @see [INodeLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-getCenterY">Online Documentation</a>
 */
 open   fun getCenterY( node: Node ):Double
/**
 * Returns the height of the given node.
 * @param [node] the node
 * @return the height of the node
 * @see [INodeLayout.height]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-getHeight">Online Documentation</a>
 */
 open   fun getHeight( node: Node ):Double
/**
 * Returns the layout information for all labels associated with the given node.
 * @param [node] the node
 * @return the layout information for the node's labels
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-getLabelLayout(Node)">Online Documentation</a>
 */
 abstract   fun getLabelLayout( node: Node ):ReadonlyArray<INodeLabelLayout>
/**
 * Returns the layout information for all labels associated with the given edge.
 * @param [edge] the edge
 * @return the layout information for the edge's labels
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-getLabelLayout(Edge)">Online Documentation</a>
 */
 abstract   fun getLabelLayout( edge: Edge ):ReadonlyArray<IEdgeLabelLayout>
/**
 * Returns the layout information for the given node.
 * @param [node] the node
 * @return the layout information for the node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-getLayout(Node)">Online Documentation</a>
 */
 abstract   fun getLayout( node: Node ):INodeLayout
/**
 * Returns the layout information for the given edge.
 * @param [edge] the edge
 * @return the layout information for the edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-getLayout(Edge)">Online Documentation</a>
 */
 abstract   fun getLayout( edge: Edge ):IEdgeLayout
/**
 * Returns the coordinates of the given node's upper-left corner.
 * @param [node] the node
 * @return the location of the node's upper-left corner
 * @see [INodeLayout.x]
 * @see [INodeLayout.y]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-getLocation">Online Documentation</a>
 */
 open   fun getLocation( node: Node ):YPoint
/**
 * Returns the edge to which the given [IEdgeLabelLayout] belongs.
 * @param [labelLayout] the label's layout information
 * @return the edge that owns the label
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-getOwnerEdge">Online Documentation</a>
 */
 abstract   fun getOwnerEdge( labelLayout: IEdgeLabelLayout ):Edge
/**
 * Returns the node to which the given [INodeLabelLayout] belongs.
 * @param [labelLayout] the label's layout information
 * @return the node that owns the label
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-getOwnerNode">Online Documentation</a>
 */
 abstract   fun getOwnerNode( labelLayout: INodeLabelLayout ):Node
/**
 * Returns the path of an edge, including the ports.
 * @param [edge] the edge
 * @return the path of the given edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-getPath">Online Documentation</a>
 */
 open   fun getPath( edge: Edge ):YPointPath
/**
 * Returns the path of an edge, including the ports.
 * @param [edge] the edge
 * @return a list of [YPoint]s representing the path of the given edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-getPathList">Online Documentation</a>
 */
 open   fun getPathList( edge: Edge ):YList<YPoint>
/**
 * Returns the control points of an edge.
 * @param [edge] the edge
 * @return a list of [YPoint]s representing the sequence of control points of the edge
 * @see [IEdgeLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-getPointList">Online Documentation</a>
 */
 open   fun getPointList( edge: Edge ):YList<YPoint>
/**
 * Returns the control points of an edge.
 * @param [edge] the edge
 * @return a [YPointPath] representing the sequence of control points of the edge
 * @see [IEdgeLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-getPoints">Online Documentation</a>
 */
 open   fun getPoints( edge: Edge ):YPointPath
/**
 * Returns the size of the given node.
 * @param [node] the node
 * @return the size of the node
 * @see [INodeLayout.width]
 * @see [INodeLayout.height]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-getSize">Online Documentation</a>
 */
 open   fun getSize( node: Node ):YDimension
/**
 * Returns the absolute coordinates of the source point of the given edge.
 * @param [edge] the edge
 * @return the absolute source point coordinates of the edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-getSourcePointAbs">Online Documentation</a>
 */
 open   fun getSourcePointAbs( edge: Edge ):YPoint
/**
 * Returns the relative coordinates of the source point of the given edge.
 * @param [edge] the edge
 * @return the relative source point coordinates of the edge
 * @see [IEdgeLayout.sourcePoint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-getSourcePointRel">Online Documentation</a>
 */
 open   fun getSourcePointRel( edge: Edge ):YPoint
/**
 * Returns the absolute coordinates of the target point of the given edge.
 * @param [edge] the edge
 * @return the absolute target point coordinates of the edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-getTargetPointAbs">Online Documentation</a>
 */
 open   fun getTargetPointAbs( edge: Edge ):YPoint
/**
 * Returns the relative coordinates of the target point of the given edge.
 * @param [edge] the edge
 * @return the relative target point coordinates of the edge
 * @see [IEdgeLayout.targetPoint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-getTargetPointRel">Online Documentation</a>
 */
 open   fun getTargetPointRel( edge: Edge ):YPoint
/**
 * Returns the width of the given node.
 * @param [node] the node
 * @return the width of the node
 * @see [INodeLayout.width]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-getWidth">Online Documentation</a>
 */
 open   fun getWidth( node: Node ):Double
/**
 * Returns the x-coordinate of the given node's upper-left corner.
 * @param [node] the node
 * @return the x-value of the node's upper-left corner
 * @see [INodeLayout.x]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-getX">Online Documentation</a>
 */
 open   fun getX( node: Node ):Double
/**
 * Returns the y-coordinate of the given node's upper-left corner.
 * @param [node] the node
 * @return the y-value of the node's upper-left corner
 * @see [INodeLayout.y]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-getY">Online Documentation</a>
 */
 open   fun getY( node: Node ):Double
/**
 * Moves the upper-left corner of a node by a given vector.
 * @param [node] the node
 * @param [dx] the x-component of the vector
 * @param [dy] the y-component of the vector
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-moveBy">Online Documentation</a>
 */
 open   fun moveBy( node: Node ,
 dx: Double ,
 dy: Double )
/**
 * Specifies the center coordinates of the given node.
 * @param [node] the node
 * @param [position] the new location of the node's center
 * @see [INodeLayout]
 * @see [setCenter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-setCenter(Node,YPoint)">Online Documentation</a>
 */
 open   fun setCenter( node: Node ,
 position: YPoint )
/**
 * Specifies the center coordinates of the given node.
 * @param [node] the node
 * @param [x] the new x-coordinate of the node's center
 * @param [y] the new y-coordinate of the node's center
 * @see [INodeLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-setCenter(Node,number,number)">Online Documentation</a>
 */
 open   fun setCenter( node: Node ,
 x: Double ,
 y: Double )
/**
 * Specifies the two end points of the given edge in absolute coordinates.
 * @param [edge] the edge
 * @param [source] the port on the source side of the edge
 * @param [target] the port on the target side of the edge
 * @see [setSourcePointAbs]
 * @see [setTargetPointAbs]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-setEndPointsAbs">Online Documentation</a>
 */
 open   fun setEndPointsAbs( edge: Edge ,
 source: YPoint ,
 target: YPoint )
/**
 * Specifies the coordinates of the upper-left corner of the given node.
 * @param [node] the node
 * @param [position] the new location of the upper-left corner
 * @see [INodeLayout.setLocation]
 * @see [setLocation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-setLocation(Node,YPoint)">Online Documentation</a>
 */
 open   fun setLocation( node: Node ,
 position: YPoint )
/**
 * Specifies the coordinates of the upper-left corner of the given node.
 * @param [node] the node
 * @param [x] the new x-coordinate of the upper-left corner
 * @param [y] the new y-coordinate of the upper-left corner
 * @see [INodeLayout.setLocation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-setLocation(Node,number,number)">Online Documentation</a>
 */
 open   fun setLocation( node: Node ,
 x: Double ,
 y: Double )
/**
 * Sets the path of the given edge.
 * ### Preconditions
 * - The length of the path must be at least `2`.
 * @param [edge] an edge in the graph
 * @param [path] the new path sequence of the edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-setPath(Edge,YPointPath)">Online Documentation</a>
 */
 open   fun setPath( edge: Edge ,
 path: YPointPath )
/**
 * Sets the path of the given edge.
 * ### Preconditions
 * - The length of the path must be at least `2`.
 * @param [edge] an edge in the graph
 * @param [path] the list of [YPoint]s representing the new path sequence of the edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-setPath(Edge,YList)">Online Documentation</a>
 */
 open   fun setPath( edge: Edge ,
 path: YList<YPoint> )
/**
 * Sets the control points of the given edge.
 * @param [edge] an edge in the graph
 * @param [points] the new sequence of control points
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-setPoints(Edge,YPointPath)">Online Documentation</a>
 */
 open   fun setPoints( edge: Edge ,
 points: YPointPath )
/**
 * Sets the control points of the given edge.
 * @param [edge] an edge in the graph
 * @param [points] the list of [YPoint]s representing the new sequence of control points
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-setPoints(Edge,YList)">Online Documentation</a>
 */
 open   fun setPoints( edge: Edge ,
 points: YList<YPoint> )
/**
 * Specifies the size of the given node.
 * @param [node] the node
 * @param [size] the new size of the node
 * @see [setSize]
 * @see [INodeLayout.setSize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-setSize(Node,YDimension)">Online Documentation</a>
 */
 open   fun setSize( node: Node ,
 size: YDimension )
/**
 * Specifies the width and height of the given node.
 * @param [node] the node
 * @param [width] the new width of the node
 * @param [height] the new height of the node
 * @see [INodeLayout.setSize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-setSize(Node,number,number)">Online Documentation</a>
 */
 open   fun setSize( node: Node ,
 width: Double ,
 height: Double )
/**
 * Specifies the absolute coordinates of the source point of the given edge.
 * @param [edge] the edge
 * @param [point] the new absolute source point coordinates of the edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-setSourcePointAbs">Online Documentation</a>
 */
 open   fun setSourcePointAbs( edge: Edge ,
 point: YPoint )
/**
 * Specifies the relative coordinates of the source point of the given edge.
 * @param [edge] the edge
 * @param [point] the new relative source point coordinates of the edge
 * @see [IEdgeLayout.sourcePoint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-setSourcePointRel">Online Documentation</a>
 */
 open   fun setSourcePointRel( edge: Edge ,
 point: YPoint )
/**
 * Specifies the absolute coordinates of the target point of the given edge.
 * @param [edge] the edge
 * @param [point] the new absolute target point coordinates of the edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-setTargetPointAbs">Online Documentation</a>
 */
 open   fun setTargetPointAbs( edge: Edge ,
 point: YPoint )
/**
 * Specifies the relative coordinates of the target point of the given edge.
 * @param [edge] the edge
 * @param [point] the new relative target point coordinates of the edge
 * @see [IEdgeLayout.targetPoint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-setTargetPointRel">Online Documentation</a>
 */
 open   fun setTargetPointRel( edge: Edge ,
 point: YPoint )

companion object : ClassMetadata<LayoutGraph> {
}
}

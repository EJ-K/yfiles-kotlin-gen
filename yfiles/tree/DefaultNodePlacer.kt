// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.algorithms.Edge
import yfiles.algorithms.Node
import yfiles.collections.IComparer
import yfiles.lang.ClassMetadata
import yfiles.layout.IEdgeLayout
import yfiles.layout.INodeLayout
import yfiles.layout.LayoutGraph

/**
 * [DefaultNodePlacer] is the default implementation of interface [INodePlacer].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultNodePlacer">Online Documentation</a>
 * 
 * @constructor Creates a new [DefaultNodePlacer] instance with custom settings.
 * @param [childPlacement] the child placement specifier describing the style of the arrangement
 * @param [rootAlignment] the alignment specifier describing how the root node is aligned with its child nodes
 * @param [routingStyle] the routing style specifier
 * @param [verticalDistance] the vertical distance between the [SubtreeShape]s
 * @param [horizontalDistance] the horizontal distance between the [SubtreeShape]s
 * @param [minimumFirstSegmentLength] the minimum length of the first edge segment (connected to the root node)
 * @param [minimumLastSegmentLength] the minimum length of the last edge segment (connected to the child node)
 * @param [minimumSlope] the minimum slope between the root node and the [SubtreeShape]s
 * @param [minimumSlopeHeight] the minimum vertical height of sloped edge segments
 * @see [childPlacement]
 * @see [rootAlignment]
 * @see [routingStyle]
 * @see [verticalDistance]
 * @see [horizontalDistance]
 * @see [minimumFirstSegmentLength]
 * @see [minimumLastSegmentLength]
 * @see [minimumSlope]
 * @see [minimumSlopeHeight]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultNodePlacer%23DefaultNodePlacer-constructor-DefaultNodePlacer(ChildPlacement,RootAlignment,RoutingStyle,number,number,number,number,number,number)">Online Documentation</a>
 * 
 * @property childPlacement
 * Gets or sets the direction in which the child nodes are placed with respect to their parent node.
 * 
 * Default value - [ChildPlacement.HORIZONTAL_DOWNWARD]
 * @throws ArgumentError if an unknown placement specifier is set
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultNodePlacer%23childPlacement">Online Documentation</a>
 * 
 * @property rootAlignment
 * Gets or sets how the root node is aligned with its children and their [SubtreeShape]s.
 * 
 * Default value - [RootAlignment.CENTER]
 * @throws ArgumentError if an unknown root alignment specifier is set
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultNodePlacer%23rootAlignment">Online Documentation</a>
 * 
 * @property routingStyle
 * Gets or sets the style in which edge paths are routed.
 * 
 * Default value - [RoutingStyle.FORK]
 * @throws ArgumentError if the specified routing style is unknown
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultNodePlacer%23routingStyle">Online Documentation</a>
 * 
 * @property verticalDistance
 * Gets or sets the vertical distance between nodes or [SubtreeShape]s.
 * 
 * Default value - `20`
 * @throws ArgumentError if the specified distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultNodePlacer%23verticalDistance">Online Documentation</a>
 * 
 * @property horizontalDistance
 * Gets or sets the horizontal distance between nodes or [SubtreeShape]s.
 * 
 * Default value - `20`
 * @throws ArgumentError if the specified distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultNodePlacer%23horizontalDistance">Online Documentation</a>
 * 
 * @property minimumFirstSegmentLength
 * Gets or sets the minimum length for the first segment of an edge.
 * 
 * Default value - `20`
 * @throws ArgumentError if the minimum segment length is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultNodePlacer%23minimumFirstSegmentLength">Online Documentation</a>
 * 
 * @property minimumLastSegmentLength
 * Gets or sets the minimum length for the last segment of an edge.
 * 
 * Default value - `20`
 * @throws ArgumentError if the minimum segment length is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultNodePlacer%23minimumLastSegmentLength">Online Documentation</a>
 * 
 * @property minimumSlope
 * Gets or sets the minimum slope of the edge segments.
 * 
 * Default value - `0`
 * @see [minimumSlopeHeight]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultNodePlacer%23minimumSlope">Online Documentation</a>
 * 
 * @property minimumSlopeHeight
 * Gets or sets the minimum height for sloped edge segments.
 * 
 * Default value - `0`
 * @see [minimumSlope]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultNodePlacer%23minimumSlopeHeight">Online Documentation</a>
 */
external open class DefaultNodePlacer  (
open var childPlacement: ChildPlacement,
open var rootAlignment: RootAlignment,
open var routingStyle: RoutingStyle,
open var verticalDistance: Double = definedExternally,
open var horizontalDistance: Double = definedExternally,
open var minimumFirstSegmentLength: Double = definedExternally,
open var minimumLastSegmentLength: Double = definedExternally,
open var minimumSlope: Double = definedExternally,
open var minimumSlopeHeight: Double = definedExternally) : NodePlacerBase, IFromSketchNodePlacer {
/**
 * Creates a new [DefaultNodePlacer] instance with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultNodePlacer%23DefaultNodePlacer-constructor-DefaultNodePlacer()">Online Documentation</a>
 */
 constructor()
/**
 * Creates a new [DefaultNodePlacer] instance with customized [child placement][childPlacement], [vertical][verticalDistance] and [horizontal distance][horizontalDistance].
 * @param [childPlacement] the child placement specifier describing the style of the arrangement
 * @param [verticalDistance] the vertical distance between the [SubtreeShape]s
 * @param [horizontalDistance] the horizontal distance between the [SubtreeShape]s
 * @see [childPlacement]
 * @see [verticalDistance]
 * @see [horizontalDistance]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultNodePlacer%23DefaultNodePlacer-constructor-DefaultNodePlacer(ChildPlacement,number,number)">Online Documentation</a>
 */
 constructor( childPlacement: ChildPlacement ,
 verticalDistance: Double ,
 horizontalDistance: Double )
/**
 * Creates a new [DefaultNodePlacer] instance with customized [child placement][childPlacement], [root alignment][rootAlignment], [vertical][verticalDistance] and [horizontal distance][horizontalDistance].
 * @param [childPlacement] the child placement specifier describing the style of the arrangement
 * @param [rootAlignment] the alignment specifier describing how the root node is aligned with its child nodes
 * @param [verticalDistance] the vertical distance between the [SubtreeShape]s
 * @param [horizontalDistance] the horizontal distance between the [SubtreeShape]s
 * @see [childPlacement]
 * @see [rootAlignment]
 * @see [verticalDistance]
 * @see [horizontalDistance]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultNodePlacer%23DefaultNodePlacer-constructor-DefaultNodePlacer(ChildPlacement,RootAlignment,number,number)">Online Documentation</a>
 */
 constructor( childPlacement: ChildPlacement ,
 rootAlignment: RootAlignment ,
 verticalDistance: Double ,
 horizontalDistance: Double )

/**
 * Gets or sets whether or not nodes are placed so that the source and target port of an edge are aligned.
 * 
 * Default value - `false`. Ports are not aligned.
 * @see [rootAlignment]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultNodePlacer%23alignPorts">Online Documentation</a>
 */
open var alignPorts: Boolean
/**
 * Gets or sets the minimum (non-negative) distance between edge segments that are routed orthogonally in the channel between the root node and the child nodes (see [RoutingStyle.FORK]).
 * 
 * Default value - `0`
 * @throws ArgumentError if the specified distance is smaller than `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultNodePlacer%23minimumChannelSegmentDistance">Online Documentation</a>
 */
open var minimumChannelSegmentDistance: Double
/**
 * Gets or sets the relative vertical alignment of nodes with the same parent.
 * 
 * Default value - `-1`. Nodes are not aligned.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultNodePlacer%23verticalAlignment">Online Documentation</a>
 */
open var verticalAlignment: Double
/**
 * Calculates the bends for the connector to the parent node.
 * @param [graph] the input graph
 * @param [localRoot] the local root node whose connector is calculated and stored in the given subtree shape
 * @param [rootLayout] the [INodeLayout] of the root node
 * @param [subtreeShape] the shape of the whole subtree of the local root
 * @param [parentEdge] the incoming edge of the local root node that will be the connector for the given subtree shape
 * @param [parentEdgeLayout] the current [IEdgeLayout] of the connector edge
 * @param [direction] the direction specifier as defined in the [INodePlacer] interface which should be used for the connector
 * @see [NodePlacerBase.determineChildConnectors]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultNodePlacer%23DefaultNodePlacer-method-calculateParentConnector">Online Documentation</a>
 */
 open protected   fun calculateParentConnector( graph: LayoutGraph ,
 localRoot: Node ,
 rootLayout: INodeLayout ,
 subtreeShape: SubtreeShape ,
 parentEdge: Edge ,
 parentEdgeLayout: IEdgeLayout ,
 direction: Int )
/**
 * Calculates the routing of the source side of the edge to the given child node.
 * @param [rootLayout] the [INodeLayout] of the local root node
 * @param [childShape] the [SubtreeShape] instance of the corresponding child's subtree
 * @param [edge] the edge
 * @param [childForkCoordinate] the y-coordinate of the second (= last) bend of the edge if the placement is horizontal, the x-coordinate otherwise
 * @param [rootForkCoordinate] the y-coordinate of the first bend of the edge if the placement is horizontal, the x-coordinate otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultNodePlacer%23DefaultNodePlacer-method-calculateSlopedSourceEdgeLayout">Online Documentation</a>
 */
 open protected   fun calculateSlopedSourceEdgeLayout( rootLayout: INodeLayout ,
 childShape: SubtreeShape ,
 edge: Edge ,
 childForkCoordinate: Double ,
 rootForkCoordinate: Double )
/**
 * Calculates the routing of the source side of the edge to the given child node.
 * @param [rootLayout] the [INodeLayout] of the local root node
 * @param [childShape] the [SubtreeShape] of the child's subtree that is connected through the given edge
 * @param [edge] the edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultNodePlacer%23DefaultNodePlacer-method-calculateSourceEdgeLayout">Online Documentation</a>
 */
 open protected   fun calculateSourceEdgeLayout( rootLayout: INodeLayout ,
 childShape: SubtreeShape ,
 edge: Edge )
/**
 * Calculates the routing of the target side of the edge to the given child node.
 * @param [rootLayout] the [INodeLayout] of the local root node
 * @param [childShape] the [SubtreeShape] of the child's subtree that is connected through the given edge
 * @param [edge] the edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultNodePlacer%23DefaultNodePlacer-method-calculateTargetEdgeLayout">Online Documentation</a>
 */
 open protected   fun calculateTargetEdgeLayout( rootLayout: INodeLayout ,
 childShape: SubtreeShape ,
 edge: Edge )
/**
 * Creates a [IComparer] for outgoing edges which takes the initial coordinates of the edges' targets into account.
 * @return a [IComparer] that considers the initial coordinates of the nodes
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultNodePlacer%23DefaultNodePlacer-method-createComparer">Online Documentation</a>
 */
 open   fun createComparer():IComparer<Edge>
/**
 * Delegates to [createComparer].
 * @return the From Sketch [IComparer]
 * @see [createComparer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultNodePlacer%23DefaultNodePlacer-method-createFromSketchComparer">Online Documentation</a>
 */
 override   fun createFromSketchComparer():IComparer<Node>
/**
 * Determines a connector direction for the given child node depending on the selected [child placement][childPlacement].
 * @param [child] the child node
 * @return the connector direction depending on the [child placement][childPlacement]
 * @see [childPlacement]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultNodePlacer%23DefaultNodePlacer-method-determineChildConnector">Online Documentation</a>
 */
 override   fun determineChildConnector( child: Node ):ParentConnectorDirection
/**
 * Arranges the root node and its children.
 * @param [localRoot] the local root node
 * @param [parentConnectorDirection] the direction of the connector
 * @return the merged [SubtreeShape] containing the local root and all its subtrees
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultNodePlacer%23DefaultNodePlacer-method-placeSubtreeOfNode">Online Documentation</a>
 */
 override   fun placeSubtreeOfNode( localRoot: Node ,
 parentConnectorDirection: ParentConnectorDirection ):SubtreeShape

companion object : ClassMetadata<DefaultNodePlacer> {
}
}

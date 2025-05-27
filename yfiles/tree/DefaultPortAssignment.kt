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
import yfiles.lang.ClassMetadata
import yfiles.layout.LayoutGraph
import yfiles.layout.PortConstraint

/**
 * The [DefaultPortAssignment] provides some simple [port assignment styles][mode].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultTreeLayoutPortAssignment">Online Documentation</a>
 * 
 * @constructor Creates a new [DefaultPortAssignment] instance using the given port assignment mode and ratio between the border and the ports and the gap between the ports themselves.
 * @param [mode] one of the predefined port assignment specifiers
 * @param [borderGapToPortGapRatio] the ratio of the distance between outer ports and the border to the distance between any two ports
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultTreeLayoutPortAssignment%23DefaultPortAssignment-constructor-DefaultPortAssignment">Online Documentation</a>
 * 
 * @property mode
 * Gets or sets the mode that describes how ports are placed.
 * 
 * Default value - [PortAssignmentMode.NONE]
 * @throws ArgumentError if an unknown mode is specified
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultTreeLayoutPortAssignment%23mode">Online Documentation</a>
 * 
 * @property borderGapToPortGapRatio
 * Gets or sets the ratio of the *border gap* (distance between the outer ports to the node border) to the *port gap* (distance between adjacent ports).
 * 
 * Default value - `0.5`
 * @throws ArgumentError if the specified ratio is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultTreeLayoutPortAssignment%23borderGapToPortGapRatio">Online Documentation</a>
 */
@JsName("DefaultTreeLayoutPortAssignment")
external open class DefaultPortAssignment  (
open var mode: PortAssignmentMode = definedExternally,
open var borderGapToPortGapRatio: Double = definedExternally) : IPortAssignment {

/**
 * Gets or sets whether or not the port assignment should reverse the order of the ports.
 * 
 * Default value - `false`. The normal order is used for the ports.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultTreeLayoutPortAssignment%23reversedPortOrder">Online Documentation</a>
 */
open var reversedPortOrder: Boolean
/**
 * Assigns relative coordinates to the source port of the outgoing edge to a child of the given node.
 * @param [graph] the input graph
 * @param [node] the node
 * @param [edge] the edge to the child node
 * @param [index] the zero-based index of the child edge
 * @see [IEdgeLayout.sourcePoint][yfiles.layout.IEdgeLayout.sourcePoint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultTreeLayoutPortAssignment%23DefaultPortAssignment-method-assignChildEdgeSourcePort">Online Documentation</a>
 */
 open protected   fun assignChildEdgeSourcePort( graph: LayoutGraph ,
 node: Node ,
 edge: Edge ,
 index: Int )
/**
 * Assigns relative coordinates to the target port of the incoming edge from the parent of the given node.
 * @param [graph] the input graph
 * @param [node] the node
 * @param [edge] the edge from the parent node
 * @see [IEdgeLayout.targetPoint][yfiles.layout.IEdgeLayout.targetPoint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultTreeLayoutPortAssignment%23DefaultPortAssignment-method-assignParentEdgeTargetPort">Online Documentation</a>
 */
 open protected   fun assignParentEdgeTargetPort( graph: LayoutGraph ,
 node: Node ,
 edge: Edge )
/**
 * Places the ports of edges connecting to the given node according to the [port assignment mode][mode].
 * @param [graph] the input graph
 * @param [node] the node whose adjacent edges' ports should be placed
 * @see [mode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultTreeLayoutPortAssignment%23DefaultPortAssignment-method-assignPorts">Online Documentation</a>
 */
 override   fun assignPorts( graph: LayoutGraph ,
 node: Node )
/**
 * Determines the distance between the outer ports and the border of the node.
 * @param [sideLength] the width/height of the side
 * @param [edgeCount] the number of edges that connect to this side
 * @return the absolute gap to be used on both sides of the ports
 * @see [assignChildEdgeSourcePort]
 * @see [borderGapToPortGapRatio]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultTreeLayoutPortAssignment%23DefaultPortAssignment-method-getPortBorderGap">Online Documentation</a>
 */
 open protected   fun getPortBorderGap( sideLength: Double ,
 edgeCount: Int ):Double
/**
 * Determines the distance between two adjacent ports.
 * @param [sideLength] the width/height of the side
 * @param [edgeCount] the number of edges/ports that connect to this side
 * @param [portBorderGap] the port border gap (i.e. calculated by [getPortBorderGap])
 * @return the absolute distance to be used between two adjacent ports
 * @see [assignChildEdgeSourcePort]
 * @see [getPortBorderGap]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultTreeLayoutPortAssignment%23DefaultPortAssignment-method-getPortDistanceDelta">Online Documentation</a>
 */
 open protected   fun getPortDistanceDelta( sideLength: Double ,
 edgeCount: Int ,
 portBorderGap: Double ):Double
/**
 * Retrieves the source [PortConstraint] for the given edge.
 * @param [graph] the input graph
 * @param [edge] the edge
 * @param [index] the index of the child that is the target of the given edge
 * @return the source [PortConstraint] or `null` if no source [PortConstraint] is specified
 * @see [PortConstraint]
 * @see [PortConstraintKeys.SOURCE_PORT_CONSTRAINT_DP_KEY]
 * @see [assignChildEdgeSourcePort]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultTreeLayoutPortAssignment%23DefaultPortAssignment-method-getSourcePortConstraint">Online Documentation</a>
 */
 open protected   fun getSourcePortConstraint( graph: LayoutGraph ,
 edge: Edge ,
 index: Int ):PortConstraint?
/**
 * Retrieves the target [PortConstraint] for the given edge.
 * @param [graph] the input graph
 * @param [edge] the edge
 * @return the target [PortConstraint] or `null` if no target [PortConstraint] is specified
 * @see [PortConstraint]
 * @see [PortConstraintKeys.TARGET_PORT_CONSTRAINT_DP_KEY]
 * @see [assignParentEdgeTargetPort]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultTreeLayoutPortAssignment%23DefaultPortAssignment-method-getTargetPortConstraint">Online Documentation</a>
 */
 open protected   fun getTargetPortConstraint( graph: LayoutGraph ,
 edge: Edge ):PortConstraint?

companion object : ClassMetadata<DefaultPortAssignment> {
}
}

inline fun DefaultPortAssignment(
    block: DefaultPortAssignment.() -> Unit
): DefaultPortAssignment {
    return DefaultPortAssignment()
        .apply(block)
}

// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.seriesparallel

import yfiles.algorithms.Node
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject
import yfiles.layout.LayoutGraph

/**
 * A [IPortAssignment] is used by [SeriesParallelLayout] for determining the locations of the edges' ports at their incident nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ISeriesParallelLayoutPortAssignment">Online Documentation</a>
 */
@JsName("ISeriesParallelLayoutPortAssignment")
external interface IPortAssignment : YObject {
/**
 * Assigns both the incoming edges' target ports as well as all source ports for the outgoing edges.
 * @param [graph] the graph instance the node is part of
 * @param [node] the node whose incident edges' ports are assigned
 * @see [SeriesParallelLayout.OUT_EDGE_COMPARER_DP_KEY]
 * @see [SeriesParallelLayout.defaultOutEdgeComparer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ISeriesParallelLayoutPortAssignment%23IPortAssignment-method-assignPorts">Online Documentation</a>
 */
   fun assignPorts( graph: LayoutGraph ,
 node: Node )

companion object : InterfaceMetadata<IPortAssignment> {
}
}

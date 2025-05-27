// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.Graph
import yfiles.algorithms.IDataProvider
import yfiles.algorithms.Node

/**
 * [Swimlanes] provides helper classes and methods to handle swimlanes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Swimlanes">Online Documentation</a>
 */
external object Swimlanes {
/**
 * Calculates an ordering of the swimlanes.
 * @receiver the input graph
 * @param [node2Swimlane] the assignment of nodes to swimlanes
 * @see [SwimlaneRepresentative]
 * @see [GroupingSupport]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Swimlanes%23Swimlanes-method-arrangeSwimlanes(Graph,IDataProvider)">Online Documentation</a>
 */
 final   fun Graph.arrangeSwimlanes( node2Swimlane: IDataProvider<Node, SwimlaneRepresentative> )
/**
 * Calculates an ordering of the swimlanes considering the specified ordering mode.
 * @receiver the input graph
 * @param [node2Swimlane] the assignment of nodes to swimlanes
 * @param [iterations] the number of iterations performed by the heuristic.
 * @param [mode] one of the valid swimlane ordering mode specifier
 * @see [SwimlaneRepresentative]
 * @see [GroupingSupport]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Swimlanes%23Swimlanes-method-arrangeSwimlanes(Graph,IDataProvider,number,SwimlanesMode)">Online Documentation</a>
 */
 final   fun Graph.arrangeSwimlanes( node2Swimlane: IDataProvider<Node, SwimlaneRepresentative> ,
 iterations: Int ,
 mode: SwimlanesMode )
}

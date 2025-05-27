// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.algorithms.IDataMap
import yfiles.algorithms.Node
import yfiles.collections.IComparer
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * A [IProcessor] provides the possibility for each [INodePlacer] to prepare (and clean up) the graph for the children of the local root.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IProcessor">Online Documentation</a>
 */
external interface IProcessor : YObject {
/**
 * This method is called by the [TreeLayout] after the layout has finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IProcessor%23IProcessor-method-postProcess">Online Documentation</a>
 */
   fun postProcess()
/**
 * Performs preparations for the actual tree layout in a pre-processing step.
 * @param [nodePlacerDataProvider] the map that stores a [INodePlacer] instance for each node
 * @param [portAssignmentDataProvider] The map that stores a [IPortAssignment] instance for each node
 * @param [childComparatorProvider] the map that stores a [IComparer] instance for each node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IProcessor%23IProcessor-method-preProcess">Online Documentation</a>
 */
   fun preProcess( nodePlacerDataProvider: IDataMap<Node, INodePlacer> ,
 portAssignmentDataProvider: IDataMap<Node, IPortAssignment> ,
 childComparatorProvider: IDataMap<Node, IComparer<*>> )

companion object : InterfaceMetadata<IProcessor> {
}
}

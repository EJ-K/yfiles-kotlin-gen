// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.geometry.Rect
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * Interface for implementations that can calculate the bounds of a group node in a grouped graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGroupBoundsCalculator">Online Documentation</a>
 */
external interface IGroupBoundsCalculator : YObject {
/**
 * Calculates the bounds of the [INode.layout] for the given `groupNode` that is a group node in the `graph`.
 * @param [graph] The graph which holds the `groupNode`.
 * @param [groupNode] The node to calculate the bounds for.
 * @return The minimum bounds to use for the given group node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGroupBoundsCalculator%23IGroupBoundsCalculator-method-calculateBounds">Online Documentation</a>
 */
   fun calculateBounds( graph: IGraph ,
 groupNode: INode ):Rect

companion object : InterfaceMetadata<IGroupBoundsCalculator> {

/**
 * Creates an implementation of the interface [IGroupBoundsCalculator] by using the given function as implementation for its [calculateBounds] method.
 * @param [calculateBounds] A function for [IGroupBoundsCalculator]'s single abstract method [calculateBounds].
 * @return An instance of the [IGroupBoundsCalculator] interface based on the given function.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGroupBoundsCalculator%23IGroupBoundsCalculator-method-create">Online Documentation</a>
 */
            @JsName("create")
            operator fun  invoke(
                calculateBounds: (
            graph: IGraph,
groupNode: INode
            ) -> Rect 
            ):IGroupBoundsCalculator
}
}

// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.Node
import yfiles.algorithms.NodeList
import yfiles.algorithms.Rectangle2D
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * A [IGroupBoundsCalculator] is responsible for calculating the bounds of a group node during a layout process.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayoutGroupBoundsCalculator">Online Documentation</a>
 */
@JsName("ILayoutGroupBoundsCalculator")
external interface IGroupBoundsCalculator : YObject {
/**
 * Calculates the bounds of the given group node that contains the given list of child nodes.
 * @param [graph] the input graph
 * @param [groupNode] the group node whose bounds will be calculated
 * @param [children] a [NodeList] containing the nodes that reside inside the group node
 * @return a [Rectangle2D] instance that describes the bounds of the group node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayoutGroupBoundsCalculator%23IGroupBoundsCalculator-method-calculateBounds">Online Documentation</a>
 */
   fun calculateBounds( graph: LayoutGraph ,
 groupNode: Node ,
 children: NodeList ):Rectangle2D

companion object : InterfaceMetadata<IGroupBoundsCalculator> {

/**
 * Creates an implementation of the interface [IGroupBoundsCalculator] by using the given function as implementation for its [calculateBounds] method.
 * @param [calculateBounds] A function for [IGroupBoundsCalculator]'s single abstract method [calculateBounds].
 * @return An instance of the [IGroupBoundsCalculator] interface based on the given function.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayoutGroupBoundsCalculator%23IGroupBoundsCalculator-method-create">Online Documentation</a>
 */
            @JsName("create")
            operator fun  invoke(
                calculateBounds: (
            graph: LayoutGraph,
groupNode: Node,
children: NodeList
            ) -> Rectangle2D 
            ):IGroupBoundsCalculator
}
}

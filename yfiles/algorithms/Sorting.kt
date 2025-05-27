// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import js.array.ReadonlyArray

/**
 * This class provides methods for efficiently sorting graph elements in graph structures.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SortingAlgorithm">Online Documentation</a>
 */
@JsName("SortingAlgorithm")
external object Sorting {
/**
 * Sorts the nodes of a given graph by degree in ascending order.
 * @receiver the given graph
 * @return an array of [Node]s sorted by degree in ascending order
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SortingAlgorithm%23Sorting-method-sortNodesByDegree">Online Documentation</a>
 */
 final   fun Graph.sortNodesByDegree():ReadonlyArray<Node>
/**
 * Sorts the nodes of a given graph by an integer key associated with each node through a [IDataProvider].
 * @receiver the given graph
 * @param [keys] the [IDataProvider] that returns the keys based on which the nodes will be sorted
 * @return an array of [Node]s sorted by an integer key in ascending order
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SortingAlgorithm%23Sorting-method-sortNodesByIntKey">Online Documentation</a>
 */
 final   fun Graph.sortNodesByIntKey( keys: IDataProvider<Node, Int> ):ReadonlyArray<Node>
}

// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * An interface that determines the distance between two nodes of a graph.
 * @see [Groups.hierarchicalClustering]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeDistanceProvider">Online Documentation</a>
 */
external interface INodeDistanceProvider : YObject {
/**
 * Returns the distance between two given nodes of a graph.
 * @param [n1] the first node
 * @param [n2] the second node
 * @return the distance between the two given nodes
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeDistanceProvider%23INodeDistanceProvider-method-getDistance">Online Documentation</a>
 */
   fun getDistance( n1: Node ,
 n2: Node ):Double

companion object : InterfaceMetadata<INodeDistanceProvider> {

/**
 * Creates an implementation of the interface [INodeDistanceProvider] by using the given function as implementation for its [getDistance] method.
 * @param [getDistance] A function for [INodeDistanceProvider]'s single abstract method [getDistance].
 * @return An instance of the [INodeDistanceProvider] interface based on the given function.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeDistanceProvider%23INodeDistanceProvider-method-create">Online Documentation</a>
 */
            @JsName("create")
            operator fun  invoke(
                getDistance: (
            n1: Node,
n2: Node
            ) -> Double 
            ):INodeDistanceProvider
}
}

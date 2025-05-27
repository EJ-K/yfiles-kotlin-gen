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
 * An instance of this interface handles intersections found by the `IntersectionAlgorithm`,
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IIntersectionHandler">Online Documentation</a>
 */
external interface IIntersectionHandler<T : IPlaneObject> : YObject {
/**
 * This method is called at every intersection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IIntersectionHandler%23IIntersectionHandler-method-checkIntersection">Online Documentation</a>
 */
   fun checkIntersection( a: T ,
 b: T )

companion object : InterfaceMetadata<IIntersectionHandler<*>> {

/**
 * Creates an implementation of the interface [IIntersectionHandler] by using the given function as implementation for its [checkIntersection] method.
 * @param [checkIntersection] A function for [IIntersectionHandler]'s single abstract method [checkIntersection].
 * @return An instance of the [IIntersectionHandler] interface based on the given function.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IIntersectionHandler%23IIntersectionHandler-method-create">Online Documentation</a>
 */
            @JsName("create")
            operator fun <T : IPlaneObject> invoke(
                checkIntersection: (
            a: T,
b: T
            ) -> Unit 
            ):IIntersectionHandler<T>
}
}

// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.collections.IEnumerable
import yfiles.geometry.Point
import yfiles.graph.IModelItem
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * An interface that can enumerate hits of a given type for a certain position in world coordinates.
 * @param [T] the type of hits returned by the enumerator
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IHitTester">Online Documentation</a>
 */
external interface IHitTester<T : IModelItem> : YObject {
/**
 * Yields an enumerable that enumerates the hits for a given world coordinate.
 * @param [context] The context in which to perform the hit testing.
 * @param [location] the coordinates in the world coordinate system
 * @return an enumerable that yields hits for the given coordinates
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IHitTester%23IHitTester-method-enumerateHits">Online Documentation</a>
 */
   fun enumerateHits( context: IInputModeContext ,
 location: Point ):IEnumerable<T>

companion object : InterfaceMetadata<IHitTester<*>> {

/**
 * Creates an implementation of the interface [IHitTester] by using the given function as implementation for its [enumerateHits] method.
 * @param [enumerateHits] A function for [IHitTester]'s single abstract method [enumerateHits].
 * @return An instance of the [IHitTester] interface based on the given function.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IHitTester%23IHitTester-method-create">Online Documentation</a>
 */
            @JsName("create")
            operator fun <T : IModelItem> invoke(
                enumerateHits: (
            context: IInputModeContext,
location: Point
            ) -> IEnumerable<T> 
            ):IHitTester<T>
}
}

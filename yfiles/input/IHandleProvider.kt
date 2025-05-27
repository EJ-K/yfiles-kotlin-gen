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
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * Interface for an object that provides a number of [IHandle] implementations.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IHandleProvider">Online Documentation</a>
 */
external interface IHandleProvider : YObject {
/**
 * Returns a collection of zero or more [IHandle] implementations that are associated with this instance.
 * @return A collection of handles.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IHandleProvider%23IHandleProvider-method-getHandles">Online Documentation</a>
 */
   fun getHandles( context: IInputModeContext ):IEnumerable<IHandle>

companion object : InterfaceMetadata<IHandleProvider> {

/**
 * Creates an implementation of the interface [IHandleProvider] by using the given function as implementation for its [getHandles] method.
 * @param [getHandles] A function for [IHandleProvider]'s single abstract method [getHandles].
 * @return An instance of the [IHandleProvider] interface based on the given function.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IHandleProvider%23IHandleProvider-method-create">Online Documentation</a>
 */
@JsName("create")
operator fun  invoke(
    getHandles: (
context: IInputModeContext
) -> IEnumerable<IHandle> 
):IHandleProvider
}
}

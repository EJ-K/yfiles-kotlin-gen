// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.graph.IEdge
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * An interface for classes that can yield [IHandle] implementations for the [source][IEdge.sourcePort] and [target][IEdge.targetPort] ends of an [IEdge].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgePortHandleProvider">Online Documentation</a>
 */
external interface IEdgePortHandleProvider : YObject {
/**
 * Gets an [IHandle] implementation for one end of the provided `edge`.
 * @param [context] The context in which the handle will be used.
 * @param [edge] The edge for which an handle is needed.
 * @param [sourceHandle] if set to `true` the handle for the source side/port should be returned.
 * @return The handle to use for the provided side or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgePortHandleProvider%23IEdgePortHandleProvider-method-getHandle">Online Documentation</a>
 */
   fun getHandle( context: IInputModeContext ,
 edge: IEdge ,
 sourceHandle: Boolean ):IHandle?

companion object : InterfaceMetadata<IEdgePortHandleProvider> {

/**
 * Creates an implementation of the interface [IEdgePortHandleProvider] by using the given function as implementation for its [getHandle] method.
 * @param [getHandle] A function for [IEdgePortHandleProvider]'s single abstract method [getHandle].
 * @return An instance of the [IEdgePortHandleProvider] interface based on the given function.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgePortHandleProvider%23IEdgePortHandleProvider-method-create">Online Documentation</a>
 */
            @JsName("create")
            operator fun  invoke(
                getHandle: (
            context: IInputModeContext,
edge: IEdge,
sourceHandle: Boolean
            ) -> IHandle 
            ):IEdgePortHandleProvider
}
}

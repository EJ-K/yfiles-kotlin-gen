// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.lang.InterfaceMetadata

/**
 * An interface for classes that can yield [IHandle] implementations for the [source][yfiles.graph.IEdge] and [target][yfiles.graph.IEdge] ends of an [IEdge][yfiles.graph.IEdge].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgePortHandleProvider">Online Documentation</a>
 */
external interface IEdgePortHandleProvider  {
  /**
   * Gets an [IHandle] implementation for one end of the edge.
   * @param [context] The context in which the handle will be used.
   * @param [sourceHandle] if set to `true` the handle for the source side/port should be returned.
   * @return The handle to use for the provided side or `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgePortHandleProvider%23IEdgePortHandleProvider-method-getHandle">Online Documentation</a>
   */
  fun getHandle(
    context: IInputModeContext,
    sourceHandle: Boolean,
  ): IHandle?

  
  companion object : InterfaceMetadata<IEdgePortHandleProvider> {
  
    /**
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgePortHandleProvider%23IEdgePortHandleProvider-method-create">Online Documentation</a>
     */
    @JsName("create")
    operator fun  invoke(
      getHandle: (context: IInputModeContext, sourceHandle: Boolean) -> IHandle
    ): IEdgePortHandleProvider
  }
}

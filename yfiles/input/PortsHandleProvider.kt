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
import yfiles.graph.IPort
import yfiles.graph.IPortOwner
import yfiles.lang.ClassMetadata

/**
 * An implementation of an [IHandleProvider] that returns all handles in the lookup of the ports owned by the given owner.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortsHandleProvider">Online Documentation</a>
 * 
 * @constructor Creates an instance using the given owner as the provider for the ports.
 * @param [owner] The [IPortOwner] that will serve as the provider for the ports.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortsHandleProvider%23PortsHandleProvider-constructor-PortsHandleProvider">Online Documentation</a>
 */
open external class PortsHandleProvider (
  owner: IPortOwner,
) : IHandleProvider {
  /**
   * The owner of the ports.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortsHandleProvider%23portOwner">Online Documentation</a>
   */
  protected final val portOwner: IPortOwner
  
  /**
   * Retrieves the handle implementation from the port's lookup.
   * @param [port] The [IPort] from which the [IHandle] should be retrieved using its lookup.
   * @return The [IHandle] retrieved from the `port` lookup, or `null` if no handle is found.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortsHandleProvider%23PortsHandleProvider-method-getHandle">Online Documentation</a>
   */
  protected open fun getHandle(
    port: IPort,
  ): IHandle?
  
  /**
   * Returns a collection of zero or more [IHandle] implementations that are associated with the ports of this context.
   * @param [context] The [IInputModeContext].
   * @return A collection of handles.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortsHandleProvider%23PortsHandleProvider-method-getHandles">Online Documentation</a>
   */
  final override fun getHandles(
    context: IInputModeContext,
  ): IEnumerable<IHandle>
  
  companion object : ClassMetadata<PortsHandleProvider> {
  }
}

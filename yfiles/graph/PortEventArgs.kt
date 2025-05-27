// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.ItemEventArgs
import yfiles.lang.ClassMetadata

/**
 * A specialized subclass of the [ItemEventArgs] class that is bound to the [IPort] type and carries additional [IPortOwner] information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortEventArgs">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [PortEventArgs] class.
 * @param [port] The port to assign to the [ItemEventArgs.item] property.
 * @param [owner] The owner of the port the port was attached to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortEventArgs%23PortEventArgs-constructor-PortEventArgs">Online Documentation</a>
 * 
 * @property owner
 * Gets the owner the port the was connected to before the event happened.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortEventArgs%23owner">Online Documentation</a>
 */
external  class PortEventArgs  (
 port: IPort ,
final val owner: IPortOwner) : ItemEventArgs<IPort> {

companion object : ClassMetadata<PortEventArgs> {
}
}

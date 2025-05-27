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
 * A specialized subclass of the [ItemEventArgs] class that is bound to the [ILabel] type and carries additional [owner][ILabelOwner] information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelEventArgs">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [LabelEventArgs] class.
 * @param [label] The label to assign to the [item][ItemEventArgs] property.
 * @param [owner] The previous owner of the label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelEventArgs%23LabelEventArgs-constructor-LabelEventArgs">Online Documentation</a>
 * 
 * @property owner
 * Gets the owner of the label that owned the label before the event happened.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelEventArgs%23owner">Online Documentation</a>
 */
external class LabelEventArgs (
label: ILabel,
final val owner: ILabelOwner?) : ItemEventArgs<ILabel> {
  
  companion object : ClassMetadata<LabelEventArgs> {
  }
}

// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.lang.YFlags

/**
 * Defines the rules for pasting nodes into group nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParentNodeDetectionModes">Online Documentation</a>
 */
external class ParentNodeDetectionModes 
    private constructor(): YFlags<ParentNodeDetectionModes> {
    companion object {
    /**
 * Undefined, used for comparison.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParentNodeDetectionModes%23NONE">Online Documentation</a>
 */
val NONE: ParentNodeDetectionModes
/**
 * If exactly one group node is selected the nodes should be pasted into that group.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParentNodeDetectionModes%23SELECTION">Online Documentation</a>
 */
val SELECTION: ParentNodeDetectionModes
/**
 * A node should be pasted into its original parent.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParentNodeDetectionModes%23PREVIOUS_PARENT">Online Documentation</a>
 */
val PREVIOUS_PARENT: ParentNodeDetectionModes
/**
 * A node should be pasted into the group node at the location where the node is pasted to or the root if there is no group node.
 * 
 * Value - `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParentNodeDetectionModes%23AT_LOCATION">Online Documentation</a>
 */
val AT_LOCATION: ParentNodeDetectionModes
/**
 * Nodes should always be pasted into the root group.
 * 
 * Value - `8`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParentNodeDetectionModes%23ROOT">Online Documentation</a>
 */
val ROOT: ParentNodeDetectionModes
/**
 * A bitmask that can be used to query the actual mode ([ROOT], [SELECTION], [AT_LOCATION], or [PREVIOUS_PARENT]).
 * 
 * Value - `255`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParentNodeDetectionModes%23MODE_MASK">Online Documentation</a>
 */
val MODE_MASK: ParentNodeDetectionModes
/**
 * When used in combination with [SELECTION] or [AT_LOCATION] this setting will allow pasting nodes into their original.
 * 
 * Value - `256`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParentNodeDetectionModes%23ALLOW_SELF">Online Documentation</a>
 */
val ALLOW_SELF: ParentNodeDetectionModes
/**
 * If combined with [PREVIOUS_PARENT] forces the node to be pasted into its original parent, even if the parent has moved far away and pasting the node would increase the parents size considerably.
 * 
 * Value - `512`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParentNodeDetectionModes%23FORCE">Online Documentation</a>
 */
val FORCE: ParentNodeDetectionModes
/**
 * A bitmask that can be used to query modifications of the actual mode such as [ALLOW_SELF] or [FORCE].
 * 
 * Value - `65280`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ParentNodeDetectionModes%23MODIFIER_MASK">Online Documentation</a>
 */
val MODIFIER_MASK: ParentNodeDetectionModes

    }
}

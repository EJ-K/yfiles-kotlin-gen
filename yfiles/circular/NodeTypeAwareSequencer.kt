// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.circular

import yfiles.algorithms.Graph
import yfiles.algorithms.INodeCursor
import yfiles.algorithms.INodeSequencer
import yfiles.lang.ClassMetadata

/**
 * A [INodeSequencer] implementation that ensures that all nodes of the same [node type][yfiles.layout.LayoutKeys.NODE_TYPE_DP_KEY] are consecutive.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeTypeAwareSequencer">Online Documentation</a>
 * 
 * @constructor Creates a new [NodeTypeAwareSequencer] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeTypeAwareSequencer%23NodeTypeAwareSequencer-constructor-NodeTypeAwareSequencer">Online Documentation</a>
 */
external open class NodeTypeAwareSequencer  () : INodeSequencer {

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeTypeAwareSequencer%23NodeTypeAwareSequencer-method-nodes">Online Documentation</a>
 */
 override   fun nodes( graph: Graph ):INodeCursor

companion object : ClassMetadata<NodeTypeAwareSequencer> {
}
}

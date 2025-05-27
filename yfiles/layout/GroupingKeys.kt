// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.NodeDpKey
import yfiles.algorithms.YDimension
import yfiles.algorithms.YInsets
import yfiles.lang.Id

/**
 * This interface defines [IDataProvider][yfiles.algorithms.IDataProvider] keys for those layout algorithms that can handle hierarchically grouped graphs.
 * @see [GroupingSupport]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupingKeys">Online Documentation</a>
 */
external object GroupingKeys {
/**
 * A data provider key for distinguishing normal nodes from group nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupingKeys%23GROUP_DP_KEY">Online Documentation</a>
 */
 val GROUP_DP_KEY: NodeDpKey<Boolean>
/**
 * A data provider key for assigning insets for group nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupingKeys%23GROUP_NODE_INSETS_DP_KEY">Online Documentation</a>
 */
 val GROUP_NODE_INSETS_DP_KEY: NodeDpKey<YInsets>
/**
 * A data provider key for assigning minimum sizes for group nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupingKeys%23MINIMUM_NODE_SIZE_DP_KEY">Online Documentation</a>
 */
 val MINIMUM_NODE_SIZE_DP_KEY: NodeDpKey<YDimension>
/**
 * A data provider key for assigning a unique ID for each node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupingKeys%23NODE_ID_DP_KEY">Online Documentation</a>
 */
 val NODE_ID_DP_KEY: NodeDpKey<Id>
/**
 * A data provider key for describing the hierarchy of nodes in the graph.
 * @see [NODE_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupingKeys%23PARENT_NODE_ID_DP_KEY">Online Documentation</a>
 */
 val PARENT_NODE_ID_DP_KEY: NodeDpKey<Id>
}

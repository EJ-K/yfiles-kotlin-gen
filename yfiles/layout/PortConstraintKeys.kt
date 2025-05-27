// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.EdgeDpKey
import yfiles.lang.Id

/**
 * [PortConstraintKeys] are used for associating [DataProviders][yfiles.algorithms.IDataProvider] that contain constraints for the edges of the input graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraintKeys">Online Documentation</a>
 */
external object PortConstraintKeys {
/**
 * A data provider key for assigning source group information for edges of the input graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraintKeys%23SOURCE_GROUP_ID_DP_KEY">Online Documentation</a>
 */
 val SOURCE_GROUP_ID_DP_KEY: EdgeDpKey<Id>
/**
 * A data provider key for providing source constraints for edges in the input graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraintKeys%23SOURCE_PORT_CONSTRAINT_DP_KEY">Online Documentation</a>
 */
 val SOURCE_PORT_CONSTRAINT_DP_KEY: EdgeDpKey<PortConstraint>
/**
 * A data provider key for assigning port group ids to the edges' source.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraintKeys%23SOURCE_PORT_GROUP_ID_DP_KEY">Online Documentation</a>
 */
 val SOURCE_PORT_GROUP_ID_DP_KEY: EdgeDpKey<Id>
/**
 * A data provider key for assigning target group information for edges of the input graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraintKeys%23TARGET_GROUP_ID_DP_KEY">Online Documentation</a>
 */
 val TARGET_GROUP_ID_DP_KEY: EdgeDpKey<Id>
/**
 * A data provider key for providing target constraints for edges in the input graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraintKeys%23TARGET_PORT_CONSTRAINT_DP_KEY">Online Documentation</a>
 */
 val TARGET_PORT_CONSTRAINT_DP_KEY: EdgeDpKey<PortConstraint>
/**
 * A data provider key for assigning port group ids to the edges' target.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraintKeys%23TARGET_PORT_GROUP_ID_DP_KEY">Online Documentation</a>
 */
 val TARGET_PORT_GROUP_ID_DP_KEY: EdgeDpKey<Id>
}

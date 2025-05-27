// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.lang.ClassMetadata
import yfiles.lang.Id
import yfiles.lang.YObject

/**
 * A descriptor for bus-related information to be associated with an edge.
 * @see [BusRouter.EDGE_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusRouterBusDescriptor">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [BusDescriptor] for the specified parameters.
 * @param [busId] the ID of the bus to which the associated edge belongs
 * @param [fixed] `true` if associated edge is fixed, `false` otherwise
 * @param [sourceGroupId] the group ID of the source side
 * @param [targetGroupId] the group ID of the target side
 * @param [routingPolicy] one of the predefined routing policies
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusRouterBusDescriptor%23BusDescriptor-constructor-BusDescriptor(Object,boolean,Object,Object,RoutingPolicy)">Online Documentation</a>
 */
@JsName("BusRouterBusDescriptor")
external open class BusDescriptor  ( busId: Id ,
 fixed: Boolean ,
 sourceGroupId: Id ,
 targetGroupId: Id ,
 routingPolicy: RoutingPolicy ) : YObject {
/**
 * Creates a new instance of [BusDescriptor] for the specified bus ID which is marked as not fixed and uses the default edge group IDs.
 * @param [busId] the ID of the bus to which the associated edge belongs
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusRouterBusDescriptor%23BusDescriptor-constructor-BusDescriptor(Object)">Online Documentation</a>
 */
 constructor( busId: Id )
/**
 * Creates a new instance of [BusDescriptor] for the specified parameters and default group IDs.
 * @param [busId] the ID of the bus to which the associated edge belongs
 * @param [fixed] `true` if associated edge is fixed, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusRouterBusDescriptor%23BusDescriptor-constructor-BusDescriptor(Object,boolean)">Online Documentation</a>
 */
 constructor( busId: Id ,
 fixed: Boolean )
/**
 * Creates a new instance of [BusDescriptor] for the specified parameters and marks it as not fixed.
 * @param [busId] the ID of the bus to which the associated edge belongs
 * @param [sourceGroupId] the group ID of the source side
 * @param [targetGroupId] the group ID of the target side
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusRouterBusDescriptor%23BusDescriptor-constructor-BusDescriptor(Object,Object,Object)">Online Documentation</a>
 */
 constructor( busId: Id ,
 sourceGroupId: Id ,
 targetGroupId: Id )
/**
 * Creates a new instance of [BusDescriptor] for the specified parameters.
 * @param [busId] the ID of the bus to which the associated edge belongs
 * @param [fixed] `true` if associated edge is fixed, `false` otherwise
 * @param [sourceGroupId] the group ID of the source side
 * @param [targetGroupId] the group ID of the target side
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusRouterBusDescriptor%23BusDescriptor-constructor-BusDescriptor(Object,boolean,Object,Object)">Online Documentation</a>
 */
 constructor( busId: Id ,
 fixed: Boolean ,
 sourceGroupId: Id ,
 targetGroupId: Id )

/**
 * Gets or sets the bus ID.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusRouterBusDescriptor%23busId">Online Documentation</a>
 */
open var busId: Id?
/**
 * Gets or sets whether or not the associated edge is fixed.
 * 
 * Default value - `false`. The associated edge is not fixed (unless otherwise specified in the constructor).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusRouterBusDescriptor%23fixed">Online Documentation</a>
 */
open var fixed: Boolean
/**
 * Gets or sets the routing policy indicating if the edge associated with this descriptor is unconditionally routed or if the existing route determines whether a routing is even necessary.
 * 
 * Default value - [RoutingPolicy.ALWAYS]. The edge is routed, ignoring the existing sketch.
 * @throws ArgumentError if an unknown routing policy is given
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusRouterBusDescriptor%23routingPolicy">Online Documentation</a>
 */
open var routingPolicy: RoutingPolicy
/**
 * Gets or sets the group ID for the source side of the edge.
 * 
 * Default value - [Object][yfiles.lang.Object]. All associated edges ending at the same node belong to the same group (unless otherwise specified in the constructor).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusRouterBusDescriptor%23sourceGroupId">Online Documentation</a>
 */
open var sourceGroupId: Id?
/**
 * Gets or sets the group ID for the target side of the edge.
 * 
 * Default value - [Object][yfiles.lang.Object]. All associated edges ending at the same node belong to the same group (unless otherwise specified in the constructor).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusRouterBusDescriptor%23targetGroupId">Online Documentation</a>
 */
open var targetGroupId: Id?

companion object : ClassMetadata<BusDescriptor> {
}
}

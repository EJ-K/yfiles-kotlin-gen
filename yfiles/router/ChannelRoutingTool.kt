// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.geometry.Point
import yfiles.lang.ClassMetadata
import yfiles.lang.Id

/**
 * This routing algorithm computes orthogonal routes to the edges within a channel.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelRoutingTool">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [ChannelRoutingTool].
 * @param [min] The smallest assignable coordinate within the channel.
 * @param [max] The largest assignable coordinate within the channel.
 * @param [orientation] The orientation of the channel. If omitted, the default value is [HORIZONTAL][ChannelOrientation].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelRoutingTool%23ChannelRoutingTool-constructor-ChannelRoutingTool">Online Documentation</a>
 */
external class ChannelRoutingTool (
  min: Double,
  max: Double,
  orientation: ChannelOrientation  = definedExternally,
)  {
  /**
   * Gets or sets the current epsilon value.
   * 
   * Default value - `0.5`
   * @see [ignoreEpsilonChannel]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelRoutingTool%23epsilon">Online Documentation</a>
   */
  final var epsilon: Double
  
  /**
   * Gets or sets whether or not middle segments with lengths smaller than [epsilon][ChannelRoutingTool] are ignored.
   * 
   * Default value - `true`
   * @see [epsilon]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelRoutingTool%23ignoreEpsilonChannel">Online Documentation</a>
   */
  final var ignoreEpsilonChannel: Boolean
  
  /**
   * Gets the number of sub-channels (i.e., different coordinates assigned to the edge objects) within this channel.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelRoutingTool%23subchannelCount">Online Documentation</a>
   */
  final val subchannelCount: Int
  
  /**
   * Adds an edge object that belongs to an edge group to the set of elements that should be routed within the channel.
   * @param [key] the unique id of the edge
   * @param [groupId] the id of the edge group
   * @param [p1] the first endpoint of the edge
   * @param [p2] the second endpoint of the edge
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelRoutingTool%23ChannelRoutingTool-method-addGroupSegment">Online Documentation</a>
   */
  fun addGroupSegment(
    key: Id,
    groupId: Id,
    p1: Point,
    p2: Point,
  )
  
  /**
   * Adds an edge object with endpoints `p1` and `p2` to the set of elements that should be routed within the channel.
   * @param [key] the unique id of the edge
   * @param [p1] the first endpoint of the edge
   * @param [p2] the second endpoint of the edge
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelRoutingTool%23ChannelRoutingTool-method-addSegment">Online Documentation</a>
   */
  fun addSegment(
    key: Id,
    p1: Point,
    p2: Point,
  )
  
  /**
   * Returns whether the given id has already been registered as a group id.
   * @param [groupId] the group id used during [adding][ChannelRoutingTool]
   * @return `true` if the key has already been registered, `false` otherwise
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelRoutingTool%23ChannelRoutingTool-method-containsGroupKey">Online Documentation</a>
   */
  fun containsGroupKey(
    groupId: Id,
  ): Boolean
  
  /**
   * Returns whether the given key has already been registered.
   * @param [key] the key used during [adding][ChannelRoutingTool]
   * @return `true` if the key has already been registered, `false` otherwise
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelRoutingTool%23ChannelRoutingTool-method-containsKey">Online Documentation</a>
   */
  fun containsKey(
    key: Id,
  ): Boolean
  
  /**
   * Returns the calculated channel coordinate for an added edge object.
   * @param [key] the key used during [adding][ChannelRoutingTool] the edge object
   * @return the channel coordinate of the associated edge object
   * @see [addSegment]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelRoutingTool%23ChannelRoutingTool-method-getChannelCoordinate">Online Documentation</a>
   */
  fun getChannelCoordinate(
    key: Id,
  ): Double
  
  /**
   * Returns the sub-channel rank for the specified edge group within the channel.
   * @param [groupId] the group id used during [adding][ChannelRoutingTool] an edge object
   * @return the sub-channel rank of the edge group
   * @see [subchannelCount]
   * @see [addGroupSegment]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelRoutingTool%23ChannelRoutingTool-method-getGroupSubchannelRank">Online Documentation</a>
   */
  fun getGroupSubchannelRank(
    groupId: Id,
  ): Double
  
  /**
   * Returns the sub-channel rank of the specified edge object within the channel.
   * @param [key] the key used during [adding][ChannelRoutingTool] the edge object
   * @return the sub-channel rank of the given edge object
   * @see [subchannelCount]
   * @see [addSegment]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelRoutingTool%23ChannelRoutingTool-method-getSubchannelRank">Online Documentation</a>
   */
  fun getSubchannelRank(
    key: Id,
  ): Double
  
  /**
   * Routes all added edge objects within the specified channel.
   * @see [addSegment]
   * @see [addGroupSegment]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelRoutingTool%23ChannelRoutingTool-method-route">Online Documentation</a>
   */
  fun route()
  
  /**
   * Specifies the channel bounds and orientation.
   * @param [min] The smallest assignable coordinate within the channel.
   * @param [max] The largest assignable coordinate within the channel.
   * @param [orientation] The orientation of the channel. If omitted, the default value is [HORIZONTAL][ChannelOrientation].
   * @see [addSegment]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelRoutingTool%23ChannelRoutingTool-method-setChannel">Online Documentation</a>
   */
  fun setChannel(
    min: Double,
    max: Double,
    orientation: ChannelOrientation  = definedExternally,
  )
  
  companion object : ClassMetadata<ChannelRoutingTool> {
  }
}

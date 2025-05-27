// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.algorithms.EdgeList
import yfiles.algorithms.YList
import yfiles.collections.IComparer
import yfiles.collections.IList
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * This class routes edges using their pre-calculated [Path] information.
 * @see [EdgeInfo.getSegmentInfo]
 * @see [LayoutGraph.setPath][yfiles.layout.LayoutGraph.setPath]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelBasedPathRouting">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [ChannelBasedPathRouting].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelBasedPathRouting%23ChannelBasedPathRouting-constructor-ChannelBasedPathRouting">Online Documentation</a>
 */
external open class ChannelBasedPathRouting  () : YObject {

/**
 * Gets the [path search configuration][PathSearchConfiguration] with which the [ChannelBasedPathRouting] has been [initialized][initialize].
 * @see [initialize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelBasedPathRouting%23configuration">Online Documentation</a>
 */
protected open val configuration: PathSearchConfiguration
/**
 * Adjusts the location assigned to a [segment info][SegmentInfo] in the [channel][Channel] considering the preferred alignment of the segment.
 * @param [channel] the channel that contains the segment infos for which the alignment should be considered
 * @see [Channel.getCurrentLocation]
 * @see [SegmentInfoBase.preferredAlignment]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelBasedPathRouting%23ChannelBasedPathRouting-method-adjustSegmentLocations">Online Documentation</a>
 */
 open protected   fun adjustSegmentLocations( channel: Channel )
/**
 * Calculates the locations of the [segment infos][SegmentInfo] in the given [channel][Channel].
 * ### Preconditions
 * - The locations of the segments are [stored][Channel.setCurrentLocation] in the [channel][Channel]. They should respect minimum edge to edge distances and grid constraints and must lie in the respective [location range][SegmentInfoBase.locationRange]s.
 * @param [channel] the channel that contains the segment infos for which the locations will be calculated
 * @see [Channel.setCurrentLocation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelBasedPathRouting%23ChannelBasedPathRouting-method-calculateSegmentLocations">Online Documentation</a>
 */
 open protected   fun calculateSegmentLocations( channel: Channel )
/**
 * Resets all [channel][Channel] information and the reference to the [configuration][PathSearchConfiguration].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelBasedPathRouting%23ChannelBasedPathRouting-method-cleanUp">Online Documentation</a>
 */
 open   fun cleanUp()
/**
 * Creates a [comparator][IComparer] for sorting the [SegmentInfo]s in a [Channel] from left to right (for vertical segments) or top to bottom (for horizontal segments), respectively.
 * @param [channels] the channels whose segments will be sorted by the [comparator][IComparer]
 * @param [pathSearchResult] the [path search result][PathSearchResult] containing the [EdgeInfo]s with the [SegmentInfo]s for which the comparator will be used
 * @param [configuration] the [configuration][PathSearchConfiguration] used during this path search
 * @return a [comparator][IComparer] used for sorting the [SegmentInfo]s in a [channel][Channel]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelBasedPathRouting%23ChannelBasedPathRouting-method-createSegmentInfoComparer">Online Documentation</a>
 */
 open protected   fun createSegmentInfoComparer( channels: YList<Channel> ,
 pathSearchResult: PathSearchResult ,
 configuration: PathSearchConfiguration ):IComparer<SegmentInfo>
/**
 * Initializes this [ChannelBasedPathRouting] instance for routing paths that have been found with the given [configuration][PathSearchConfiguration].
 * @param [configuration] the [configuration][PathSearchConfiguration] used for the following path routing
 * @see [route]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelBasedPathRouting%23ChannelBasedPathRouting-method-initialize">Online Documentation</a>
 */
 open   fun initialize( configuration: PathSearchConfiguration )
/**
 * Optimizes the order of the [segments][SegmentInfo] in the given [channel][Channel].
 * @param [channel] the channel for which the order of the [SegmentInfo]s is optimized
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelBasedPathRouting%23ChannelBasedPathRouting-method-optimizeSegmentOrder">Online Documentation</a>
 */
 open protected   fun optimizeSegmentOrder( channel: Channel )
/**
 * Routes the given edges.
 * @param [edges] the [list of edges][EdgeList] to be routed
 * @param [pathSearchResult] the [path search result][PathSearchResult] containing the [Path] objects for the edges
 * @throws InvalidOperationError if the locations are not within the segment's location range
 * @see [PathSearchResult.getPath]
 * @see [SegmentInfoBase.locationRange]
 * @see [SegmentInfoBase.location]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelBasedPathRouting%23ChannelBasedPathRouting-method-route">Online Documentation</a>
 */
 open   fun route( edges: EdgeList ,
 pathSearchResult: PathSearchResult )
/**
 * Sorts the given list of [SegmentInfo]s using the given [comparator][IComparer].
 * @param [segmentInfos] the list of [SegmentInfo]s to be sorted
 * @param [segmentInfoComparer] the comparator used for sorting the list of [SegmentInfo]s
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelBasedPathRouting%23ChannelBasedPathRouting-method-sortSegmentInfos">Online Documentation</a>
 */
 open protected   fun sortSegmentInfos( segmentInfos: IList<out SegmentInfo> ,
 segmentInfoComparer: IComparer<in SegmentInfo> )

companion object : ClassMetadata<ChannelBasedPathRouting> {
}
}

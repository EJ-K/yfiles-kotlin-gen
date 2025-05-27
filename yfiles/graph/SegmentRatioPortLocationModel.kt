// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.geometry.Point
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject

/**
 * A port location model that places the port on a certain edge segment at a specified ratio.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SegmentRatioPortLocationModel">Online Documentation</a>
 */
external  class SegmentRatioPortLocationModel 
private constructor () : IPortLocationModel {

/**
 * Creates the a new parameter for the specified segment index and ratio.
 * @param [ratio] The ratio for the segment, with `0` being at the start of the segment and `1` at the end.
 * @param [segmentIndex] The index of the segment.
 * @return A parameter for the given ratio and segment.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SegmentRatioPortLocationModel%23SegmentRatioPortLocationModel-method-createFromSource">Online Documentation</a>
 */
 final   fun createFromSource( ratio: Double ,
 segmentIndex: Int ):IPortLocationModelParameter
/**
 * Creates the a new parameter for the specified segment index counted from the target end of the edge and the provided ratio.
 * @param [ratio] The ratio for the segment, with `0` being at the start of the segment and `1` at the end.
 * @param [segmentIndex] The index of the segment counted from the target end.
 * @return A parameter for the given ratio and segment.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SegmentRatioPortLocationModel%23SegmentRatioPortLocationModel-method-createFromTarget">Online Documentation</a>
 */
 final   fun createFromTarget( ratio: Double ,
 segmentIndex: Int ):IPortLocationModelParameter
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SegmentRatioPortLocationModel%23SegmentRatioPortLocationModel-method-createParameter">Online Documentation</a>
 */
 final override   fun createParameter( owner: IPortOwner ,
 location: Point ):IPortLocationModelParameter
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SegmentRatioPortLocationModel%23SegmentRatioPortLocationModel-method-getContext">Online Documentation</a>
 */
 final override   fun getContext( port: IPort ,
 locationParameter: IPortLocationModelParameter ):ILookup
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SegmentRatioPortLocationModel%23SegmentRatioPortLocationModel-method-getLocation">Online Documentation</a>
 */
 final override   fun getLocation( port: IPort ,
 locationParameter: IPortLocationModelParameter ):Point
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SegmentRatioPortLocationModel%23SegmentRatioPortLocationModel-method-lookup">Online Documentation</a>
 */
 final override   fun <T : YObject>lookup( type: YClass<T> ):T?

companion object : ClassMetadata<SegmentRatioPortLocationModel> {
/**
 * A static immutable global instance of this class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SegmentRatioPortLocationModel%23INSTANCE">Online Documentation</a>
 */
 val INSTANCE: SegmentRatioPortLocationModel
}
}

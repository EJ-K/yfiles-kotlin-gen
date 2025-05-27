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
 * An implementation of the [IPortLocationModel] that can create [IPortLocationModelParameter]s that describe the location of ports that are attached to the bends of [IEdge]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendAnchoredPortLocationModel">Online Documentation</a>
 */
external  class BendAnchoredPortLocationModel 
private constructor () : IPortLocationModel {

/**
 * Creates a parameter that indicates the location of the bend with index `bendIndex` starting from the source side.
 * @param [bendIndex] The index of the bend counting from the source side.
 * @return A parameter that anchors the port at a bend.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendAnchoredPortLocationModel%23BendAnchoredPortLocationModel-method-createFromSource">Online Documentation</a>
 */
 final   fun createFromSource( bendIndex: Int ):IPortLocationModelParameter
/**
 * Creates a parameter that indicates the location of the bend with index `bendIndex` starting from the target side.
 * @param [bendIndex] The index of the bend counting from the target side.
 * @return A parameter that anchors the port at a bend.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendAnchoredPortLocationModel%23BendAnchoredPortLocationModel-method-createFromTarget">Online Documentation</a>
 */
 final   fun createFromTarget( bendIndex: Int ):IPortLocationModelParameter
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendAnchoredPortLocationModel%23BendAnchoredPortLocationModel-method-createParameter">Online Documentation</a>
 */
 final override   fun createParameter( owner: IPortOwner ,
 location: Point ):IPortLocationModelParameter
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendAnchoredPortLocationModel%23BendAnchoredPortLocationModel-method-getContext">Online Documentation</a>
 */
 final override   fun getContext( port: IPort ,
 locationParameter: IPortLocationModelParameter ):ILookup
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendAnchoredPortLocationModel%23BendAnchoredPortLocationModel-method-getLocation">Online Documentation</a>
 */
 final override   fun getLocation( port: IPort ,
 locationParameter: IPortLocationModelParameter ):Point
/**
 * This implementation has nothing in its lookup and will always yield `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendAnchoredPortLocationModel%23BendAnchoredPortLocationModel-method-lookup">Online Documentation</a>
 */
 final override   fun <T : YObject>lookup( type: YClass<T> ):T?

companion object : ClassMetadata<BendAnchoredPortLocationModel> {
/**
 * A parameter that is bound to the first [IBend] of the edge.
 * @see [createFromSource]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendAnchoredPortLocationModel%23FIRST_BEND">Online Documentation</a>
 */
 val FIRST_BEND: IPortLocationModelParameter
/**
 * A static immutable global instance of this class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendAnchoredPortLocationModel%23INSTANCE">Online Documentation</a>
 */
 val INSTANCE: BendAnchoredPortLocationModel
/**
 * A parameter that is bound to the last [IBend] of the edge.
 * @see [createFromTarget]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendAnchoredPortLocationModel%23LAST_BEND">Online Documentation</a>
 */
 val LAST_BEND: IPortLocationModelParameter
}
}

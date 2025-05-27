// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.geometry.GeneralPath
import yfiles.geometry.Tangent
import yfiles.lang.ClassMetadata

/**
 * A void implementation of the [IPathGeometry] interface that does nothing and behaves like an empty path.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidPathGeometry">Online Documentation</a>
 */
external  class VoidPathGeometry 
private constructor () : IPathGeometry {

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidPathGeometry%23VoidPathGeometry-method-getPath">Online Documentation</a>
 */
 final override   fun getPath():GeneralPath?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidPathGeometry%23VoidPathGeometry-method-getSegmentCount">Online Documentation</a>
 */
 final override   fun getSegmentCount():Int
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidPathGeometry%23VoidPathGeometry-method-getTangent">Online Documentation</a>
 */
 final override   fun getTangent( ratio: Double ):Tangent?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidPathGeometry%23VoidPathGeometry-method-getTangentForSegment">Online Documentation</a>
 */
 final override   fun getTangentForSegment( segmentIndex: Int ,
 ratio: Double ):Tangent?

companion object : ClassMetadata<VoidPathGeometry> {
/**
 * The [VoidPathGeometry] singleton.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/VoidPathGeometry%23INSTANCE">Online Documentation</a>
 */
 val INSTANCE: IPathGeometry
}
}

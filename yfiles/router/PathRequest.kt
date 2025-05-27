// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.collections.ICollection
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject
import yfiles.layout.PortCandidate

/**
 * A [PathRequest] describes a routing request from a [source obstacle][source] to a [target obstacle][target] which is handled and considered during a [PathSearch].
 * @see [PathSearchExtension.initializeCurrentPathRequest]
 * @see [PathSearchExtension.cancelCurrentPathRequest]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathRequest">Online Documentation</a>
 */
external open class PathRequest  : YObject {

/**
 * Gets the [EdgeLayoutDescriptor] that describes routing settings for this path request.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathRequest%23descriptor">Online Documentation</a>
 */
open val descriptor: EdgeLayoutDescriptor
/**
 * Gets the path that was found for this path request.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathRequest%23foundPath">Online Documentation</a>
 */
open val foundPath: Path
/**
 * Gets the source obstacle describing the area where this request starts.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathRequest%23source">Online Documentation</a>
 */
open val source: Obstacle
/**
 * Gets the source [PortCandidate]s associated with this path request and describing how the path must connect to the source obstacle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathRequest%23sourcePortCandidates">Online Documentation</a>
 */
open val sourcePortCandidates: ICollection<out PortCandidate>
/**
 * Gets the target obstacle describing the area where this request ends.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathRequest%23target">Online Documentation</a>
 */
open val target: Obstacle
/**
 * Gets the target [PortCandidate]s associated with this path request and describing how the path must connect to the target obstacle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathRequest%23targetPortCandidates">Online Documentation</a>
 */
open val targetPortCandidates: ICollection<out PortCandidate>

companion object : ClassMetadata<PathRequest> {
}
}

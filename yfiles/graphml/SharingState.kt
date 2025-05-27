// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * The sharing states of objects registered at an [IReferenceHandler] via [IReferenceHandler.registerResource].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SharingState">Online Documentation</a>
 */
external sealed class SharingState: YEnum<SharingState> {
   companion object: EnumMetadata<SharingState> {
       /**
 * The registered object shall not be shared.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SharingState%23UNSHARED">Online Documentation</a>
 */
val UNSHARED: SharingState

/**
 * The object has been registered the first time.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SharingState%23FIRST_SEEN">Online Documentation</a>
 */
val FIRST_SEEN: SharingState

/**
 * The object has been registered multiple times and will be shared.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SharingState%23DUPLICATE">Online Documentation</a>
 */
val DUPLICATE: SharingState
   }
}

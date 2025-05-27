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
 * Describes the storage location of the file operations.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StorageLocation">Online Documentation</a>
 */
external sealed class StorageLocation: YEnum<StorageLocation> {
   companion object: EnumMetadata<StorageLocation> {
       /**
 * No location at all, effectively disabling storage operations.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StorageLocation%23NONE">Online Documentation</a>
 */
val NONE: StorageLocation

/**
 * The local storage as described by the W3C Web Storage API.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StorageLocation%23LOCAL_STORAGE">Online Documentation</a>
 */
val LOCAL_STORAGE: StorageLocation

/**
 * The session storage as described by the W3C Web Storage API.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StorageLocation%23SESSION_STORAGE">Online Documentation</a>
 */
val SESSION_STORAGE: StorageLocation

/**
 * The file system.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StorageLocation%23FILE_SYSTEM">Online Documentation</a>
 */
val FILE_SYSTEM: StorageLocation
   }
}
